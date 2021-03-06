package br.edu.fapce.nexti.security.dto.loginuser;

import br.edu.fapce.nexti.security.model.LoginUser;
import br.edu.fapce.nexti.security.model.UserRole;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ResponseLoginUserDTO {
	private @NonNull Long id;
	private @NonNull String email;
	private @NonNull UserRole userRole;
	private @NonNull String nome;

	public ResponseLoginUserDTO(LoginUser lu) {
		setId(lu.getId());
		setEmail(lu.getEmail());
		setUserRole(lu.getUserRole());
		setNome(lu.getNome());
	}
}
