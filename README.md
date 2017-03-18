# johnzodmod

johnzodmod is an example for showing how to create java.sql.Time converter and use it.

By coping TimeConverter.java into your project and adding this annotation @JohnzonConverter(TimeConverter.class)
above a field in JPA Entity, Johnzon must be able to convert java.sql.Time.
