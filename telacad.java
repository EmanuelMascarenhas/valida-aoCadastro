package sistemacompleto2;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Random;

import javax.swing.JOptionPane;

public class telacad {

	JFrame frame;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUsuario;
	private JPasswordField password;
	private JPasswordField confirmepassword;
	private JTextField txtEstado;
	JFormattedTextField txtCep;
	JFormattedTextField txtCpf;
	JFormattedTextField txtTelefone;
	JFormattedTextField txtTelefone2;
	JFormattedTextField txtDataDeNascimento;
	String sexo;
	JRadioButton rdbMasculino;
	JRadioButton rdbFeminino;
	String nome;
	String email;
	String cpf;
	String cep;
	String endereco;
	String numero;
	String estado;
	String cidade;
	String bairro;
	String UF;
	String telefone;
	String telefone2;
	String dtNasc;
	String usuario;
	String senha;
	String confirmesenha;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacad window = new telacad();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public telacad() {
		initialize();
	}
	public void visivel( ) {
		telacad window = new telacad();
		window.frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 213, 250));
		frame.setBounds(100, 100, 664, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			MaskFormatter maskcep = new MaskFormatter("##.###-###");
			txtCep = new JFormattedTextField(maskcep);
			MaskFormatter maskcpf = new MaskFormatter("###.###.###-##");
			txtCpf = new JFormattedTextField(maskcpf);
			MaskFormatter masktel = new MaskFormatter("(##)#####-####");
			txtTelefone = new JFormattedTextField(masktel);
			txtTelefone2 = new JFormattedTextField(masktel);
			MaskFormatter masknasc = new MaskFormatter("##/##/####");
			txtDataDeNascimento = new JFormattedTextField(masknasc);
		} catch (Exception e) {
			
		}
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(216, 0, 314, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Nome.setBounds(25, 82, 46, 14);
		frame.getContentPane().add(Nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(98, 79, 197, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel Email = new JLabel("Email:");
		Email.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Email.setBounds(25, 107, 46, 14);
		frame.getContentPane().add(Email);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(98, 104, 197, 20);
		frame.getContentPane().add(txtEmail);
		
		JLabel Cpf = new JLabel("CPF:");
		Cpf.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Cpf.setBounds(25, 132, 46, 14);
		frame.getContentPane().add(Cpf);
		
		//txtCpf = new JFormattedTextField();
		txtCpf.setBounds(98, 129, 197, 20);
		frame.getContentPane().add(txtCpf);
		
		JLabel Cep = new JLabel("Cep:");
		Cep.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Cep.setBounds(25, 157, 46, 14);
		frame.getContentPane().add(Cep);
		
		//txtCep = new JFormattedTextField();
		txtCep.setBounds(98, 153, 197, 22);
		frame.getContentPane().add(txtCep);
		
		JLabel Endereco = new JLabel("Endereço:");
		Endereco.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Endereco.setBounds(25, 183, 63, 14);
		frame.getContentPane().add(Endereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(98, 180, 197, 20);
		frame.getContentPane().add(txtEndereco);
		
		JLabel Numero = new JLabel("Numero:");
		Numero.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Numero.setBounds(25, 208, 46, 14);
		frame.getContentPane().add(Numero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(98, 205, 197, 20);
		frame.getContentPane().add(txtNumero);
		
		JLabel Bairro = new JLabel("Bairro:");
		Bairro.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Bairro.setBounds(25, 233, 46, 14);
		frame.getContentPane().add(Bairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(98, 230, 197, 20);
		frame.getContentPane().add(txtBairro);
		
		JLabel Cidade = new JLabel("Cidade:");
		Cidade.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Cidade.setBounds(25, 258, 46, 14);
		frame.getContentPane().add(Cidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(98, 255, 197, 20);
		frame.getContentPane().add(txtCidade);
		
		JLabel Estado = new JLabel("Estado:");
		Estado.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Estado.setBounds(305, 82, 46, 14);
		frame.getContentPane().add(Estado);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(441, 79, 197, 20);
		frame.getContentPane().add(txtEstado);
		txtEstado.setColumns(10);
		
		txtCep.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String cep = txtCep.getText().trim();
				String cepsemponto = cep.replaceAll("[^0-9]","");
				if(cep.isEmpty()==false) {
					ValidarCep val = new ValidarCep();
					String dados[] = val.buscacep(cepsemponto);
					if(dados!=null) {
						txtEstado.setText(dados[1]);
						txtCidade.setText(dados[2]);
						txtBairro.setText(dados[3]);
						txtEndereco.setText(dados[4].split("-")[0].trim());
					} else {
						JOptionPane.showMessageDialog(null, "Cep não encontrado","Erro",2);
						limparcampo();
					}
				}
			}
		});
		
		JLabel Telefone = new JLabel("Telefone:");
		Telefone.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Telefone.setBounds(305, 108, 94, 14);
		frame.getContentPane().add(Telefone);
		
		//txtTelefone = new JFormattedTextField();
		txtTelefone.setBounds(441, 104, 197, 20);
		frame.getContentPane().add(txtTelefone);		
		
		JLabel Telefone2 = new JLabel("Telefone 2:");
		Telefone2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Telefone2.setBounds(305, 133, 61, 14);
		frame.getContentPane().add(Telefone2);
		
		//txtTelefone2 = new JFormattedTextField();
		txtTelefone2.setBounds(441, 129, 197, 20);
		frame.getContentPane().add(txtTelefone2);
		
		JLabel Sexo = new JLabel("Sexo:");
		Sexo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Sexo.setBounds(305, 158, 46, 14);
		frame.getContentPane().add(Sexo);
		
		rdbMasculino = new JRadioButton("M");
		rdbMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbMasculino.isSelected()) {
					rdbFeminino.setSelected(false);
					sexo = "M";
				}
			}
		});
		rdbMasculino.setBounds(548, 153, 90, 23);
		frame.getContentPane().add(rdbMasculino);
		
		rdbFeminino = new JRadioButton("F");
		rdbFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbFeminino.isSelected()) {
					rdbMasculino.setSelected(false);
					sexo = "F";
				}
			}
		});
		rdbFeminino.setBounds(441, 153, 90, 23);
		frame.getContentPane().add(rdbFeminino);
		rdbMasculino.setSelected(true);
		
		JLabel DataDeNascimento = new JLabel("Data de Nascimento:");
		DataDeNascimento.setFont(new Font("Times New Roman", Font.BOLD, 11));
		DataDeNascimento.setBounds(305, 183, 109, 14);
		frame.getContentPane().add(DataDeNascimento);
		
		//txtDataDeNascimento = new JFormattedTextField();
		txtDataDeNascimento.setBounds(441, 180, 197, 20);
		frame.getContentPane().add(txtDataDeNascimento);
		
		JLabel Usuario = new JLabel("Usuario;");
		Usuario.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Usuario.setBounds(305, 208, 46, 14);
		frame.getContentPane().add(Usuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(441, 205, 197, 20);
		frame.getContentPane().add(txtUsuario);
		
		JLabel Senha = new JLabel("Senha:");
		Senha.setFont(new Font("Times New Roman", Font.BOLD, 11));
		Senha.setBounds(305, 233, 46, 14);
		frame.getContentPane().add(Senha);
		
		password = new JPasswordField();
		password.setBounds(441, 230, 197, 20);
		frame.getContentPane().add(password);
		
		JLabel ConfirmarSenha = new JLabel("Confirmar Senha: ");
		ConfirmarSenha.setFont(new Font("Times New Roman", Font.BOLD, 11));
		ConfirmarSenha.setBounds(305, 258, 94, 14);
		frame.getContentPane().add(ConfirmarSenha);
		
		confirmepassword = new JPasswordField();
		confirmepassword.setBounds(441, 255, 197, 20);
		frame.getContentPane().add(confirmepassword);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = txtNome.getText().trim().toLowerCase();
				email = txtEmail.getText().trim();
				cpf = txtCpf.getText().trim().toLowerCase();
				cep = txtCep.getText().trim().toLowerCase();
				endereco = txtEndereco.getText().trim();
				numero = txtNumero.getText().trim().toLowerCase();
				bairro = txtBairro.getText().trim().toLowerCase();
				cidade = txtCidade.getText().trim().toLowerCase();
				estado = txtEstado.getText().trim().toLowerCase();
				telefone = txtTelefone.getText().trim().toLowerCase();
				telefone2 = txtTelefone2.getText().trim().toLowerCase();
				dtNasc = txtDataDeNascimento.getText().trim().toLowerCase();
				usuario = txtUsuario.getText().trim();
				senha = password.getText().trim();
				confirmesenha = confirmepassword.getText().trim();
				if(nome.isEmpty() == false) {
					if(email.isEmpty() == false) {
						if(cpf.replaceAll("[^\\d]","").isEmpty() == false) {
							if(cep.replaceAll("[^\\d]","").isEmpty() == false) {
								if(endereco.isEmpty() == false) {
									if(numero.isEmpty() == false) {
										if(bairro.isEmpty() == false) {
											if(cidade.isEmpty() == false) {
												if(estado.isEmpty() == false) {
													if(telefone.replaceAll("[^\\d]","").isEmpty() == false) {
														if(dtNasc.replaceAll("[^\\d]","").isEmpty() == false) {
															if(senha.isEmpty() == false) {
																if(confirmesenha.isEmpty() == false) {
																	if(nome.matches("[A-Za-záéíóúãõâêîôûàèìòù ]+")) {
																		if(email.toLowerCase().matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}")) {
																			ValidaCPF val = new ValidaCPF();
																			String cpfsemponto = cpf.replaceAll("[^0-9]", "");
																			if(val.isCPF(cpfsemponto));
																				if(endereco.matches("[A-Za-z0-9- ]+")) {
																					int num = Integer.parseInt(numero);
																					if(numero.matches("[0-9]+") && num > 0 && num < 99999 ) {
																						if(bairro.matches("[A-Za-z0-9 ]+")) {
																							if(cidade.matches("[A-Za-z0-9 ]+")) {
																								if(estado.matches("[A-Za-z ]+")) {
																									BancoDeDados banc = new BancoDeDados();
																									banc.conectar();
																									if(banc.estaConectado()) {
																										if(banc.validarUsuario(usuario) == false) {
																											if(senha.equals(confirmesenha)) {																												
																												Random codigodeverificacao = new Random();
																												int verificacao = 100000+codigodeverificacao.nextInt(900000);
																												EnviarEmail env = new EnviarEmail();
																												String Messagem = "Olá "+nome+"\n"+"Sejá bem vindo ao How I am."+"\n"+"Aqui esta o seu codigo de verificação para cadastro"+"\n"+verificacao;
																												String Assunto = "Cadastro realizado com sucesso";
																												env.enviar(email, Assunto, Messagem);
																												String input;
																												int resposta = 0;
																												while(true) {
																													if(resposta != verificacao) {
																														input = JOptionPane.showInputDialog(null,"Digite o codigo de confirmação");
																														resposta = Integer.parseInt(input);
																													} 
																													else if(resposta == verificacao) {
																														break;
																													}
																												}
																												banc.inserirUsuario(nome,email,cpf,endereco,numero,bairro,cidade,estado,cep,telefone,telefone2,sexo,dtNasc,usuario,senha);
																												JOptionPane.showMessageDialog(null, "Cadastro reealizado com sucesso!","Aviso",1);
																												telasis window = new telasis("usuario logado");
																												window.frame.setVisible(true);
																											} else {
																												JOptionPane.showMessageDialog(null, "Senha invalida!","Erro",3);
																											}
																										} else {
																											JOptionPane.showMessageDialog(null, "Usuario já existe!","Erro",3);
																										}
																									} else {
																										JOptionPane.showMessageDialog(null, "Não foi possivel conectar o banco!","Erro",3);
																									}
																								} else {
																									JOptionPane.showMessageDialog(null, "Estado invalido!","Erro",3);
																								}
																							} else {
																								JOptionPane.showMessageDialog(null, "Cidade invalida!","Erro",3);
																							}
																						} else {
																							JOptionPane.showMessageDialog(null, "Bairro invalido!","Erro",3);
																						}
																					} else {
																						JOptionPane.showMessageDialog(null, "Numero invalido!","Erro",3);
																					}
																				} else {
																					JOptionPane.showMessageDialog(null, "Endereço invalido!","Erro",3);
																				}
																		} else {
																			JOptionPane.showMessageDialog(null, "Email invalido!","Erro",3);
																		}
																	} else {
																		JOptionPane.showMessageDialog(null, "Nome invalido!","Erro",3);
																	}
																} else {
																	JOptionPane.showMessageDialog(null, "Confirma senha não pode ficar vazio!","Erro",3);
																}
															} else {
																JOptionPane.showMessageDialog(null, "Senha não pode ficar vazio!","Erro",3);
															}
														} else {
															JOptionPane.showMessageDialog(null, "Data de nascimento não pode ficar vazio!","Erro",3);
														}
													} else {
														JOptionPane.showMessageDialog(null, "Telefone não pode ficar vazio!","Erro",3);
													}
												} else {
													JOptionPane.showMessageDialog(null, "Estado não pode ficar vazio!","Erro",3);
												}
											} else {
												JOptionPane.showMessageDialog(null, "Cidade não pode ficar vazio!","Erro",3);
											}
										} else {
											JOptionPane.showMessageDialog(null, "Bairro não pode ficar vazio!","Erro",3);
										}
									} else {
										JOptionPane.showMessageDialog(null, "Numero não pode ficar vazio!","Erro",3);
									}
								} else {
									JOptionPane.showMessageDialog(null, "Endereço não pode ficar vazio!","Erro",3);
								}
							} else {
								JOptionPane.showMessageDialog(null, "Cep não pode ficar vazio!","Erro",3);
							}
						} else {
							JOptionPane.showMessageDialog(null, "CPF não pode ficar vazio!","Erro",3);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Email não pode ficar vazio!","Erro",3);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nome não pode ficar vazio!","Erro",3);
				}
			}
		});
		btnCadastrar.setBounds(123, 322, 127, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telalogin window = new telalogin();
				window.frame.setVisible(true);
			}
		});
		btnVoltar.setBounds(389, 322, 127, 23);
		frame.getContentPane().add(btnVoltar);	
	}
	

	protected void limparcampo() {
		txtEstado.setText("");
		txtCidade.setText("");
		txtBairro.setText("");
		txtEndereco.setText("");
		
	}
	
}
