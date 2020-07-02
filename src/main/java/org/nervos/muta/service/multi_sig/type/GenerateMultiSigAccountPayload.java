package org.nervos.muta.service.multi_sig.type;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nervos.muta.client.type.graphql_schema_scalar.Address;
import org.nervos.muta.client.type.primitive.U32;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenerateMultiSigAccountPayload {
  private Address owner;
  private List<AddressWithWeight> addr_with_weight;
  private U32 threshold;
  private String memo;
}