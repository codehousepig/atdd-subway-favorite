package nextstep.login.github;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GithubAccessTokenRequest {
	private String code;
	private String clientId;
	private String clientSecret;
}
