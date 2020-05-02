package utils;

import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

/*
 * Regular Expression tool:
 * 
 * http://utilitymill.com/utility/Regex_For_Range
 */
public class NumberFilter extends DocumentFilter {
    private Pattern pattern;

    public NumberFilter() {
        pattern = Pattern.compile("([0-9]{1,4}|10000)");
    }

    // manual invocation
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
        Matcher m = pattern.matcher(newStr);

        if (m.matches()) {
            super.insertString(fb, offset, string, attr);
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    // automatic invocation
    @Override
    public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
        try {
        	
        } catch (NumberFormatException ex) {
        	System.out.println("EXCEPTION FOUND");
        }
    	super.remove(fb, offset, length);
    }

    // automatic invocation
    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
        if (length > 0) {
            fb.remove(offset, length);
        }

        insertString(fb, offset, string, attr);
    }
}