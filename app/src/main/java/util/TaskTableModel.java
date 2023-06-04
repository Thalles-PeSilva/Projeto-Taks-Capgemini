/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import Model.Task;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thall
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome", "Descri��o", "Prazo", "Tarefa Conclu�da", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 1:
                    return tasks.get(rowIndex).getName();
            case 2:
                    return tasks.get(rowIndex).getDescription();
                
            case 3:
                    return tasks.get(rowIndex).getDeadline();
                
            case 4:
                    return tasks.get(rowIndex).isIsCompledted();
                
            case 5:
                    return "";
                
            case 6:
                    return "";
                
            default:
                return "Dados n�o encontrados";
                      
        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}