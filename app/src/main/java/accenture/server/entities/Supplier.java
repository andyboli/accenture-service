package accenture.server.entities;

@Entity
public class Supplier {
	private String code;

	@Column(nullable = true)
	private String companyId;
	@Column(nullable = true)
	private String personId;
}
