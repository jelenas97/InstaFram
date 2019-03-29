package gui.Tree;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

public class CellEditor extends DefaultTreeCellEditor{

	public CellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
		super(tree, renderer);
	}

	public CellEditor(JTree tree, DefaultTreeCellRenderer renderer,
			TreeCellEditor editor) {
		super(tree, renderer, editor);
	}

	@Override
	public Component getTreeCellEditorComponent(JTree tree, Object value,
			boolean isSelected, boolean expanded, boolean leaf, int row) {
		return super.getTreeCellEditorComponent(tree, value, isSelected,
				expanded, leaf, row);
	}

	@Override
	public Object getCellEditorValue() {
		return super.getCellEditorValue();
	}

	@Override
	public boolean stopCellEditing() {
		return false;
	}
}


