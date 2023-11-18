# Estudo simples com Spring Boot

Estudo criado com auxilio de tutorial.

O objetivo deste projeto no git é fazer anotações do que foi aprendido em estudos a  partir de um tutorial do site [Spring Boot](https://spring.io/), usando o código feito com auxilio de tutorial como exemplo.


## Stack utilizada


**Back-end:** Java, Spring Boot

**Testes Unitários:** JUnit framework


### O que foi usado

- Spring Boot 3.1.5

- Intellij IDE

- Java 17.0.8

- Maven 5.15.0


## Sobre a API

Inicialmente foi usado o site [Spring Initializr](https://start.spring.io/) para criar um projeto Spring com a dependência web do framework.



### Teste as versões usadas
Java pelo terminal
```bash
 java -version
```
Maven pelo terminal
```bash
 mvn -version
```
Para saber a versão do Spring você será perguntado qual versão quer usar como dependência, mas pode verificar no arquivo pom.xml.


```xml
  	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.1.5</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
```

### Annotations usadas

em andamento
| Annotation   | O que faz   |
| :---------- | :--------- | 
| `@Test` | Indica que um método deve ser lido e compilado como um teste | 
| `@Autowired` | Indica que um método deve ser lido e compilado como um teste |


### Funções usadas
| Função   | O que faz  | Biblioteca |
| :---------- | :--------- | :--------- | 
| `perform()`      | A... | Biblioteca |



## Métodos criados

### Classe HelloControllerTest
```java
...
    @Test
    public void getHello() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().string(equalTo("Greetings from spring boot")));
    }
...
```
### Classe TesteapiApplication
```java
...
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Let's see the beans names:");
			String []  beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String b: beanNames) {
				System.out.println(b);
			}
		};
	}
...
```

## Referências

 - [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
 - [Readme.so](https://readme.so/pt)
 - [Spring Initializr](https://start.spring.io/)

