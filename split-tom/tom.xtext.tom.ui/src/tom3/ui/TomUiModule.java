/*
 * generated by Xtext
 */
package tom3.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TomUiModule extends tom3.ui.AbstractTomUiModule {
	public TomUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return tom.ui.contentassist.TomTemplateProvider.class;
	}
}
