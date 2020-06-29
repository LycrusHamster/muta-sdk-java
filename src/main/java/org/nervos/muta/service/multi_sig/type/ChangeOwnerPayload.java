package org.nervos.muta.service.multi_sig.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeOwnerPayload {
    private VerifySignaturePayload witness;
    private String multi_sig_address;
    private String new_owner;
}
