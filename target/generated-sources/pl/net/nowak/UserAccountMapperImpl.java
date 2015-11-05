package pl.net.nowak;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-11-06T00:29:31+0100",
    comments = "version: 1.0.0.CR1, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
public class UserAccountMapperImpl implements UserAccountMapper {

    @Override
    public UserDTO userAccountToUserDTO(UserAccount account) {
        if ( account == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( account.getName() );
        userDTO.setAgreements( agreementsToAgreementsDTOs( account.getAgreements() ) );

        return userDTO;
    }

    @Override
    public Set<AgreementDTO> agreementsToAgreementsDTOs(Set<Agreement> agreements) {
        if ( agreements == null ) {
            return null;
        }

        Set<AgreementDTO> set_ = new HashSet<AgreementDTO>();
        for ( Agreement agreement : agreements ) {
            set_.add( agreementToAgreementDTO( agreement ) );
        }

        return set_;
    }

    @Override
    public AgreementDTO agreementToAgreementDTO(Agreement agreement) {
        if ( agreement == null ) {
            return null;
        }

        AgreementDTO agreementDTO_ = new AgreementDTO();

        agreementDTO_.setNumber( agreement.getNumber() );

        return agreementDTO_;
    }

}
