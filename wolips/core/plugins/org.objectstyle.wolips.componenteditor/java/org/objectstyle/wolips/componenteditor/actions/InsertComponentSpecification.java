package org.objectstyle.wolips.componenteditor.actions;

import java.util.Map;

import org.objectstyle.wolips.core.resources.types.api.Binding;

/**
 * <P>
 * This class contains the basic specifications for a new instance of a
 * component which is being inserted into another component's template. This
 * object is used to pass between say the action and the dialog box to collect
 * extra information about the insertion. An example might be that the user
 * would like to edit the name of the component instance.
 * </P>
 * 
 * @author apl
 * 
 */

public class InsertComponentSpecification {
	private String _tagName;
	
	private String _componentName;

	private String _componentInstanceName;

	private String _componentInstanceNameSuffix;

	private Binding[] _requiredBindings;
	
	private Map<String, String> _attributes;
	
	private boolean _inline;
	
	public InsertComponentSpecification(String componentName) {
		_componentName = componentName;
	}
	
	public void setAttributes(Map<String, String> attributes) {
		_attributes = attributes;
	}
	
	public Map<String, String> getHtmlAttributes() {
		return _attributes;
	}

	public void setTagName(String tagName) {
		_tagName = tagName;
	}
	
	public String getTagName() {
		return _tagName;
	}
	
	public String getComponentName() {
		return _componentName;
	}

	public void setComponentName(String componentName) {
		_componentName = componentName;
	}

	public String getComponentInstanceName() {
		return _componentInstanceName;
	}

	public void setComponentInstanceName(String componentInstanceName) {
		_componentInstanceName = componentInstanceName;
	}

	public String getComponentInstanceNameSuffix() {
		return _componentInstanceNameSuffix;
	}

	public void setComponentInstanceNameSuffix(String componentInstanceNameSuffix) {
		_componentInstanceNameSuffix = componentInstanceNameSuffix;
	}

	public Binding[] getRequiredBindings() {
		return _requiredBindings;
	}

	public void setRequiredBindings(Binding[] requiredBindings) {
		_requiredBindings = requiredBindings;
	}

	public void setInline(boolean inline) {
		_inline = inline;
	}
	
	public boolean isInline() {
		return _inline;
	}
}
