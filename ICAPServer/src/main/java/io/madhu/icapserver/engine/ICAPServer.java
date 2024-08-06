/**
 * Author: Madhu
 * User:madhu
 * Date:9/7/24
 * Time:7:24 PM
 * Project: ICAPServer
 */

package io.madhu.icapserver.engine;

import io.madhu.icapserver.dto.ICAPResponse;
import io.madhu.icapserver.entity.ScanResults;
import io.madhu.icapserver.service.AntiVirusEngine;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class ICAPServer {

    private final AntiVirusEngine antiVirusEngine;

    public ICAPResponse handleICAPRequest(byte[] fileContent){
        ScanResults scanResults = antiVirusEngine.scan(fileContent);
        ICAPResponse icapResponse = new ICAPResponse();
        if(scanResults.isClean()){
            icapResponse.setDetails(scanResults.getMalwareDetails());
            icapResponse.setStatusCode(HttpStatusCode.valueOf(200));
        }else
            icapResponse.setStatusCode(HttpStatusCode.valueOf(204));
            fileContent = null;
            return icapResponse;
    }
}
