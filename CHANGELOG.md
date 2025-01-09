#### [version] - [fecha yyyy-mm-dd]
	<Descripcion de los cambios>
	- [DEPENDENCIAS]
		- [BBDD]-[Version Release] - [Version Feature]Indicamos una breve descripcon
			Ejemplo:  [BBDD] - [V1.0] - [1.0.0] cambio etiquetas 
		- <LIBRERIAS>.- por ejemplo
			[ffmpeg] -[5.0]. libreria que nos permite manipular Audios y videos (https://ffmpeg.org/)
				Ver readme para ver instrucciones de instalacion
		- <microservicio/bom/libreria indicado por> -[groupId] - [artifactId] - [version]
			Ejemplo : 
				[com.evolutio.eiba] - [evolutio-eiba-common]-[1.2.1]
				[com.evolutio.bom] - [evolutio-bom] - [1.10.0]
 
####[2.3.9] - [2024-05-27]
Update ConversationCdr, añadir campo tenant_id
 
####[2.3.8] - [2024-04-22]
Update audio, añadir campo isDownloading

####[2.3.7] - [2024-04-18]
Update audio, añadir campo retryDate
 
####[2.3.6] - [2024-04-10]
Corrección anotación NotBlank a campo boolean
 
####[2.3.5] - [2024-04-10]
Corrección anotación NotBlank a campo int
 
####[2.3.4] - [2024-04-10]
Añadimos nuevos campos de la tabla audios en el DTO de entrada

- [DEPENDENCIAS]
	- [BBDD] - [V1.7] - [1.7.8] 
 
####[2.3.3] - [2024-03-11]
Modificamos nombre de los campos a tmoFromStart y tmoBot necesarios para KPIs de TMO

- [DEPENDENCIAS]
	- [BBDD] - [V1.7] - [1.7.6] Modificación de la tabla conversationcdr y vista para campos de TMO
 
####[2.3.2] - [2024-03-04]
Modificamos request y entidad conversation_cdr para añadir campos minStartDate y maxEndDate necesarios para KPIs de TMO
 
####[2.3.1] - [2023-11-29]
 Se modifica  para añadir los campos last_tag y destino:
 	- ConversationCdr
 	- ConversationCdrRequestDto
 	- ConversationCdrResponseDto 
 
####[2.3.0] - [2023-10-02]
 Añadimos los entity wsCDR/PromptCdr
   
####[2.2.0] - [2023-08-07]
añadimos en entity conversation_cdr (se añade el campo queue)

####[2.1.3] - [2023-08-07]
Añadimos el campo queue en ConversationCdrRequestDto/ConversationCdrResponseDto

- [DEPENDENCIAS]
	- [BBDD] - [V1.5] - [1.5.26] Nuevos literales para colas, columna cola en conversation_cdr y modificación vista para reporting de colas

####[2.1.2] - [2023-06-09]
añadimos la clase ApiExceptionsConstants con los mensajes de error genericos para el api

####[2.1.1] - [2023-06-09]
añadimos la clase ApiExceptionsConstants con los mensajes de error genericos para el api

####[2.1.0] - [2023-06-09]
añadimos la clase ApiExceptionsConstants con los mensajes de error genericos para el api

####[2.0.2] - [2023-06-09]
AÑADIR el estado(statusEnum)  FREEZE 


####[2.0.1] - [2023-06-09]
Corregir nombre de Interacción PROMPT 


####[2.0.0] - [2023-06-01]
Quitamos el entity AuditTemplate


####[1.10.4] - [2023-06-01]
- Añadir nueva entidad PrompInteractionCdrRequestDto

- [DEPENDENCIAS]
	- [BBDD] - [V1.5] - [1.5.7] Alta de tabla promp_cdr para interacciones de solo texto
	

####[1.10.3] - [2023-05-25]
- Añadido campo abandonedCall para ConversationCdrRequestDto

- [DEPENDENCIAS]
	- [BBDD] - [V1.5] - [1.5.3] Se añaden el campo abandoned a la tabla conversation_cdr


####[1.10.2] - [2023-05-17]
- Ampliar campo http_result de WsInteractionCdrRequestDto
				

####[1.10.1] - [2023-04-20]
- Modificamos el DTO InteractionCdrRequestDto para nuevos campos de entities
	
- [DEPENDENCIAS]
	- [BBDD] - [V1.4] - [1.4.23].- Añadimos a la tabla interaction_cdr campos para guardar Entity	

####[1.10.0] - [2023-04-18]
- Modificamos el entity ViewMenuUrlEndpoint
- añadimos entity ViewUserAction 
- Moficiamos entity User/ViewUser para añadir check_access
	
- [DEPENDENCIAS]
	- [BBDD] - [V1.4] - [1.4.21].- Se modifican las tablas menu_url_endpoint y vistas de vmenu_url_endpoint	, user/Vuser		

	 
####[1.9.1] - [2023-04-13]
- Modificamos entity RoleSamL para setear el nuevo campo time_zone
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.18].- Actualizaciones tablas.				
	 

####[1.9.0] - [2023-04-04]
- Modificamos UserResponseDto/ViewUserResponseDto/ViewUser/User para añadir el campo loginAttempts
- Añadimos los entity.view ViewMenuUser, ViewMenuUrlEndpoint
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.16].- Se añade las tablas vistas Se añade la tabla/Vista menu_url_endpoint/vmenu_url_endpoint			


####[1.8.0] - [2023-03-28]
- Modificamos los	entity viewUser y User y los response ViewUserResponseDto/UserResponseDto para añadir el campo  fx_last_change_password
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.16].- Se añade el campo 	fx_last_change_password a las tabla/vista user/vuser			

####[1.7.0] - [2023-03-28]
- añadimos en entity Tenant

####[1.6.0] - [2023-03-23]
   añadimos la respuesta AnalyticTableauResponseDto
     
####[1.5.0] - [2023-03-23]
   añadimos entity AnalyticTableau
    - [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.11].- Creacion de tabla Analytic_Tableau.
		- [com.evolutio.bom] - [evolutio-bom] - [1.10.0]
				
####[1.4.5] - [2023-03-22]
	Modificamos entity y view User para setear el nuevo campo time_zone
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.10].- Actualizaciones tablas.				

####[1.4.4] - [2023-03-03]
	Modificamos el objeto AutenticationSamlRequestDto para añadir el campo email

####[1.4.3] - [2023-03-01]
	Actualizo el entity role_saml
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.6].- Actualizaciones tablas.
		
####[1.4.2] - [2023-02-27]
	Modificada entidad de UserSession.
	- [DEPENDENCIAS]
		- [BBDD] - [V1.4] - [1.4.5].- se modifica tabla user_session y añaden nuevos literales de frontal.

####[1.4.1] - [2023-01-24]
	Modifica el entity UserSamLRequestDto
	
####[1.4.0] - [2023-01-24]
	Modificar el entity user/ViewUser para añadir la columna is_auth_saml
	Se añaden las entitys: RoleSaml, UserSession, role_saml_user_action, RoleSamLCompany
	- [DEPENDENCIAS]
 		- [BBDD] - [V1.4] - [1.4.4].- se añaden tablas() y campo nuevo a la tabla user 
				
####[1.3.4] - [2023-01-24]
	Añadir nueva entidad WsInteractionCdrRequestDto
####[1.3.3] - [2022-12-29]
	modificacion del nombre de un campo en la entidad ViewUserCompany
####[1.3.2] - [2022-12-29]
	Se añade un campo en la entidad ViewUserCompany
####[1.3.1] - [2022-12-27]
	Se añaden dos campos en la entidad ViewUserCompany
####[1.3.0] - [2022-12-07]
	Se añade UserCriteriaRequestDto, y se añade el campo email como nuevo criterio de busquead
	
####[1.2.4] - [2022-10-14]
	- Cambio propiedadades InteractionCdrRequestDto, para añadir los campos intent y destination

####[1.2.3] - [2022-09-14]
 	- Cambio propiedades en campos para AudioRequestDto
 	
####[1.2.2] - [2022-09-05]
 	- Version que anade el fichero CHANGELOG.md