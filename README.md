# library
1.String bHql = "SELECT b FROM Book b WHERE b.publicationYear > :year";
List<Book> books = session.createQuery(bHql)
        .setParameter("year", 2010)
        .getResultList();


2.String bHql = "UPDATE Book b SET b.price = b.price * 1.1 WHERE b.author = :author";
  int updatedCount = session.createQuery(bHql)
        .setParameter("author", author)
        .executeUpdate();

4.Query query = session.createQuery("SELECT AVG(b.price) FROM Book b");
Double averagePrice = (Double) query.getSingleResult();

5.Query query = session.createQuery("SELECT a.name, COUNT(b) " +
                              	"FROM Author a " +
                              	"LEFT JOIN a.books b " +
                              	"GROUP BY a.id, a.name");
List<Object[]> result = query.getResultList();

6.Query query = session.createQuery("SELECT b " +
                              	"FROM Book b " +
                              	"JOIN b.author a " +
                              	"WHERE a.country = :countryName");
query.setParameter("countryName", "SpecificCountry");
List<Book> books = query.getResultList();

7.The author attribute in the Book entity is mapped as a many-to-one association with the @JoinColumn annotation specifying the foreign key column name (id).
