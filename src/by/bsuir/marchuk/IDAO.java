package by.bsuir.marchuk;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathExpressionException;

public interface IDAO {
    // Печать всех элементов Good
    void printCost(Document document) throws DOMException, XPathExpressionException;
    // Печать элемента Good у которого атрибут category='kettle'
    void printCost2(Document document) throws DOMException, XPathExpressionException;
    // Печать элементов Good у которых значение Price минимальное
    void printCost3(Document document) throws DOMException, XPathExpressionException;
}
