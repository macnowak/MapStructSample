package pl.net.nowak;

import com.google.common.collect.Sets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserAccount account = new UserAccount(1L,"aaa", Sets.newHashSet(new Agreement(1L,"a"),new Agreement(2L,"b")));

        UserDTO dto = UserAccountMapper.INSTANCE.userAccountToUserDTO(account);


        System.out.println(dto.toString());



    }
}
