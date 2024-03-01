# Basic-Hibernate

#to work with hibernate, we should follow following steps
1.create configuration with following methods
  -configure(<path>)= to provide path of hibernate.cfg.xml
  -addAnnotatedClass(<path>)=to provide the class name
  
2.create service registry
  -serviceRegistryBuilder()
  -applySettings(<import>)=import configuration settings example=con.getProperties()
  -buildServiceRegistry()
3. create session factory
  -con.buildSessionFactory(<args>)= build session factory with the configuration object and args as a service registry object
4. create session
  -sf.openSession()
5. create transaction
  -session.beginTransaction();
