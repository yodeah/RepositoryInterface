package repository;

import entity.Token;
import entity.UserRole;

/**
 * Created by 212566307 on 6/13/2016.
 */
public interface TokenRepository {

    public Token save(Token token);
    public void delete(String tokenId);
    public Token findOne(String tokenId);
    public boolean isUserInRole(UserRole userRole);

}
