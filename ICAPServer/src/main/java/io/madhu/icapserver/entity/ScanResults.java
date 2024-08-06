/**
 * Author: Madhu
 * User:madhu
 * Date:9/7/24
 * Time:7:21 PM
 * Project: ICAPServer
 */

package io.madhu.icapserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScanResults {

    private boolean clean;

    private String malwareDetails;
}
