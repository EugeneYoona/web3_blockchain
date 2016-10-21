package org.web3j.protocol.parity.methods.response;

import org.web3j.protocol.core.Response;

/**
 * Null response object returned by:
 * <ul>
 * <li>personal_setAccountName</li>
 * <li>personal_setAccountMeta</li>
 * </ul>
 */
public class VoidResponse extends Response<Void> {
    public boolean isValid() {
        return !hasError();
    }
}
