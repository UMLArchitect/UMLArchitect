package org.essilab.umlizer.plugin;

import javax.swing.JPanel;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.internal.registry.spi.ConfigurationElementAttribute;
import org.eclipse.core.internal.registry.spi.ConfigurationElementDescription;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.essilab.umlizer.Umlizer;
import org.essilab.umlizer.plugin.interfaces.IAction;
import org.essilab.umlizer.plugin.interfaces.IIdeConnector;
import org.essilab.umlizer.plugin.interfaces.IPreference;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IIdeConnector{

	// The plug-in ID
	public static final String PLUGIN_ID = "umlizer-plugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	//core ;
	Umlizer umlizer;
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 * 
	 * @author
	 * @created_at
	 * 
	 */
	public void start(BundleContext context) throws Exception {
		
		
		super.start(context);
		plugin = this;

		System.out.println("Instanciating core");
		umlizer = Umlizer.getInstance();
		umlizer.setIdeConnector(this);
		
		System.out.println("Core instanciated");
		//addPreference();
		
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	public void addPreference() {
		
		
	}

	@Override
	public void addAction(IAction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPreference(IPreference arg0) {
		// sample code to add custom view (for example error log)
		int sequenceId = 0 ;
		ExtensionRegistry reg = (ExtensionRegistry)Platform.getExtensionRegistry();
		Bundle bundle = Activator.getDefault().getBundle();
		IContributor contributor = ContributorFactoryOSGi.createContributor(bundle);
		ConfigurationElementAttribute[] conf = new ConfigurationElementAttribute[6];
		conf[0] = new ConfigurationElementAttribute("id", "genericViewId" +sequenceId);
		conf[1] = new ConfigurationElementAttribute("name", "GenericView" + sequenceId);
		conf[2] = new ConfigurationElementAttribute("class", "esgi.al.plugin.views.GenericView");
		conf[3] = new ConfigurationElementAttribute("category", "esgi.al.plugin.views.GenericView");
		conf[4] = new ConfigurationElementAttribute("restorable", "true");
		conf[5] = new ConfigurationElementAttribute("allowMultiple", "true");
		String extensionPointId = "org.eclipse.ui.views";
		ConfigurationElementDescription configurationElements = new ConfigurationElementDescription("view", conf, null, null);
		Object token = reg.getTemporaryUserToken();
		reg.addExtension("",contributor,false,"",extensionPointId,configurationElements,
		token);
		sequenceId++;
	}


}
