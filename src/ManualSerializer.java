/**
 * The ManualSerializer class provides methods to manually serialize objects to JSON and XML formats.
 */
public class ManualSerializer {

  /**
   * Serializes a Book object to JSON format.
   *
   * @param book the Book object to serialize
   * @return the JSON representation of the Book object
   */
  public static String toJson(Book book) {
    return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"isbn\": \"%s\"}",
        book.getTitle(), book.getAuthor(), book.getIsbn());
  }

  /**
   * Serializes a Book object to XML format.
   *
   * @param book the Book object to serialize
   * @return the XML representation of the Book object
   */
  public static String toXml(Book book) {
    return String.format("<book><title>%s</title><author>%s</author><isbn>%s</isbn></book>",
        book.getTitle(), book.getAuthor(), book.getIsbn());
  }

  /**
   * Serializes a Library object to JSON format.
   *
   * @param library the Library object to serialize
   * @return the JSON representation of the Library object
   */
  public static String toJson(Library library) {
    return String.format("{\"name\": \"%s\", \"location\": \"%s\"}",
        library.getName(), library.getLocation());
  }

  /**
   * Serializes a Library object to XML format.
   *
   * @param library the Library object to serialize
   * @return the XML representation of the Library object
   */
  public static String toXml(Library library) {
    return String.format("<library><name>%s</name><location>%s</location></library>",
        library.getName(), library.getLocation());
  }

  /**
   * Serializes a Member object to JSON format.
   *
   * @param member the Member object to serialize
   * @return the JSON representation of the Member object
   */
  public static String toJson(Member member) {
    return String.format("{\"memberId\": \"%s\", \"name\": \"%s\", \"membershipDate\": \"%s\"}",
        member.getMemberId(), member.getName(), member.getMembershipDate());
  }

  /**
   * Serializes a Member object to XML format.
   *
   * @param member the Member object to serialize
   * @return the XML representation of the Member object
   */
  public static String toXml(Member member) {
    return String.format("<member><memberId>%s</memberId><name>%s</name><membershipDate>%s</membershipDate></member>",
        member.getMemberId(), member.getName(), member.getMembershipDate());
  }
}