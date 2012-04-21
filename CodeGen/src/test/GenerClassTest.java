package uml.test;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import uml.entities.classes.UMLClass;
import uml.entities.classes.UMLField;
import uml.entities.classes.UMLMethod;

public class GenerClassTest {
	public static void GenerationClasseJava(UMLClass cl) {
		Template template = null;
		VelocityContext context = new VelocityContext();
		StringWriter sw = new StringWriter();
		
		try {
			Velocity.init();
			context.put("class", cl );
			template = Velocity.getTemplate("TemplateJava.vm");
			
			template.merge( context, sw );
			FileWriter fw = new FileWriter(new File(cl.getIdentifier()+".java"));
			fw.write(sw.toString());
			fw.close();
		}
		catch( ResourceNotFoundException rnfe ){
			// couldn't find the template
		}
		catch( ParseErrorException pee ){
			// syntax error: problem parsing the template
		}
		catch( MethodInvocationException mie ){
			// something invoked in the template
			// threw an exception
		}
		catch( Exception e ){
			// Autre Exception
		}
	}
}
