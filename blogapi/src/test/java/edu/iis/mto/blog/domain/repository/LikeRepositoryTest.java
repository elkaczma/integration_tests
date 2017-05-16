package edu.iis.mto.blog.domain.repository;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import edu.iis.mto.blog.domain.model.AccountStatus;
import edu.iis.mto.blog.domain.model.BlogPost;
import edu.iis.mto.blog.domain.model.LikePost;
import edu.iis.mto.blog.domain.model.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LikeRepositoryTest {

	@Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repository;

    private User user;
    private BlogPost blogPost;
    private LikePost likePost;
	
	@Before
	public void setUp() {
        user = new User();
        user.setFirstName("Jan");
        user.setLastName("Nowak");
        user.setEmail("john@domain.com");
        user.setAccountStatus(AccountStatus.NEW);
        
        likePost = new LikePost();
        likePost.setUser(user);
        likePost.setId(1L);
        
        blogPost = new BlogPost();
        blogPost.setUser(user);
        blogPost.setEntry("Post");
        blogPost.setId(1L);
        blogPost.setLikes(likePost);
	}

	@Test
	public void test() {
		
	}

}
