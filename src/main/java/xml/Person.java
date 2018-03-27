package xml;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * <i>1003</i>
 * Created by xlc on 2018/3/27.
 */
public class Person {
    private String first, last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Element getXML() {
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(last);
        person.appendChild(firstName);
        person.appendChild(lastName);
        return person;
    }

    public Person(Element persion) {
        first = persion.getFirstChildElement("first").getValue();
        last = persion.getFirstChildElement("last").getValue();
    }

    @Override
    public String toString() {
        return first + " " + last;
    }

    public static void format(OutputStream os, Document document) throws IOException {
        Serializer serializer = new Serializer(os, "ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(document);
        serializer.flush();
    }

    public static void main(String[] args) throws IOException {
        List<Person> people = Arrays.asList(
                new Person("Dr. Bunsen", "Honeydew"),
                new Person("Gonzo", "The Great"),
                new Person("Phillip J.", "Fry"));
        System.out.println(people);

        Element root = new Element("people");
        for (Person p : people) {
            root.appendChild(p.getXML());
        }
        Document doc = new Document(root);
        format(new BufferedOutputStream(
                        new FileOutputStream("People.xml")),
                doc);
    }
}
