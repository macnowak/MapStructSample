package pl.net.nowak;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 06.11.15
 * Time: 00:00
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface UserAccountMapper {

    UserAccountMapper INSTANCE = Mappers.getMapper(UserAccountMapper.class);

    UserDTO userAccountToUserDTO(UserAccount account);

    Set<AgreementDTO> agreementsToAgreementsDTOs(Set<Agreement> agreements);

    AgreementDTO agreementToAgreementDTO(Agreement agreement);

}
