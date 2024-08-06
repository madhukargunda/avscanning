/**
 * Author: Madhu
 * User:madhu
 * Date:9/7/24
 * Time:7:26 PM
 * Project: ICAPServer
 */

package io.madhu.icapserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ICAPResponse {

    HttpStatusCode statusCode;
    String details;
}
