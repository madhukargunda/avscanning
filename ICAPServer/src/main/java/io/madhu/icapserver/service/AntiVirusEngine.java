/**
 * Author: Madhu
 * User:madhu
 * Date:9/7/24
 * Time:7:21 PM
 * Project: ICAPServer
 */

package io.madhu.icapserver.service;

import io.madhu.icapserver.entity.ScanResults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AntiVirusEngine {

    public ScanResults scan(byte[] fileContent){
        log.info("Antivirus Scanning is initiated");
        return new ScanResults(Boolean.TRUE,"NO Virus Detected");
    }
}
