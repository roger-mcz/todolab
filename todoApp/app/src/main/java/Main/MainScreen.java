package Main;

import controler.ProjectController;
import controler.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.TaskTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author roger
 */
public class MainScreen extends javax.swing.JFrame {

    ProjectController prjController;
    TaskController tskController;
    DefaultListModel projectsModel;
    TaskTableModel tasksModel;
    
    public MainScreen() {
        initComponents();
        decorateTableTask();
        initDataController();
        initComponentsModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmptyList = new javax.swing.JPanel();
        jLabel1LogoEmptyPrj = new javax.swing.JLabel();
        jLabelEmptyTitle = new javax.swing.JLabel();
        jLabelEmptySubTitle = new javax.swing.JLabel();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelTollBarSubTitle = new javax.swing.JLabel();
        jLabelIconEmoji = new javax.swing.JLabel();
        jPanelTitleProjects = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelProjectAdd = new javax.swing.JLabel();
        jPanelTitleTasks = new javax.swing.JPanel();
        jLabelTasks = new javax.swing.JLabel();
        jLabelTaskAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanelTaskList = new javax.swing.JPanel();

        jPanelEmptyList.setBackground(java.awt.Color.white);
        jPanelEmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1LogoEmptyPrj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1LogoEmptyPrj.setIcon(new javax.swing.ImageIcon(getClass().getResource("lists.png")));
        jLabel1LogoEmptyPrj.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1LogoEmptyPrj.setAutoscrolls(true);

        jLabelEmptyTitle.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabelEmptyTitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEmptyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyTitle.setText("Nenhuma tarefa por aqui.. :D");

        jLabelEmptySubTitle.setFont(new java.awt.Font("Noto Sans", 1, 23)); // NOI18N
        jLabelEmptySubTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmptySubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptySubTitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1LogoEmptyPrj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelEmptySubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelEmptyTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1LogoEmptyPrj, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptyTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptySubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setFont(new java.awt.Font("Noto Sans", 1, 23)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(102, 255, 204));
        jTableTasks.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));

        jPanelToolBar.setBackground(new java.awt.Color(0, 102, 102));

        jLabelToolBarTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setText("Todo App");

        jLabelTollBarSubTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabelTollBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTollBarSubTitle.setLabelFor(jPanelEmptyList);
        jLabelTollBarSubTitle.setText("Anote tudo pra não esquecer...  ");

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelToolBarLayout.createSequentialGroup()
                        .addComponent(jLabelTollBarSubTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIconEmoji)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconEmoji)
                    .addComponent(jLabelTollBarSubTitle))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelTitleProjects.setBackground(java.awt.Color.white);
        jPanelTitleProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTitleProjects.setPreferredSize(new java.awt.Dimension(266, 95));

        jLabelTitle.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle.setText("Projetos");

        jLabelProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("plus_64.png")));
        jLabelProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleProjectsLayout = new javax.swing.GroupLayout(jPanelTitleProjects);
        jPanelTitleProjects.setLayout(jPanelTitleProjectsLayout);
        jPanelTitleProjectsLayout.setHorizontalGroup(
            jPanelTitleProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleProjectsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleProjectsLayout.setVerticalGroup(
            jPanelTitleProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanelTitleTasks.setBackground(java.awt.Color.white);
        jPanelTitleTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTasks.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTasks.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabelTasks.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTasks.setText("Tarefas");

        jLabelTaskAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("plus_64.png")));
        jLabelTaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleTasksLayout = new javax.swing.GroupLayout(jPanelTitleTasks);
        jPanelTitleTasks.setLayout(jPanelTitleTasksLayout);
        jPanelTitleTasksLayout.setHorizontalGroup(
            jPanelTitleTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleTasksLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleTasksLayout.setVerticalGroup(
            jPanelTitleTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setBackground(java.awt.Color.white);
        jListProjects.setBorder(null);
        jListProjects.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(102, 255, 204));
        jListProjects.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTaskList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTaskList.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitleProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTaskList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitleTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTitleTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitleProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTaskList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectAddMouseClicked
        ProjectDialogScreen prjDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        prjDialogScreen.setVisible(true);
        
        prjDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_jLabelProjectAddMouseClicked

    private void jLabelTaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskAddMouseClicked
        TaskDialogScreen tskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        int projectIndex = jListProjects.getSelectedIndex();
        Project prj = (Project) projectsModel.get(projectIndex);
        tskDialogScreen.setProject(prj);
        tskDialogScreen.setVisible(true);
        
        tskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadTasks(prj.getId());
                
            }
        });
    }//GEN-LAST:event_jLabelTaskAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int collumnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasks().get(rowIndex);
        
        switch (collumnIndex) {
            case 4:
                //status tarefa concluída
                tskController.update(task);
                break;
            case 5:
                //botão editar
                break;
            case 6:
                //botal exluir
                tskController.removeById(task.getId());
                tasksModel.getTasks().remove(task);
                int projectIndex = jListProjects.getSelectedIndex();
                Project prj = (Project) projectsModel.get(projectIndex);
                loadTasks(prj.getId());
                break;
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        
        int projectIndex = jListProjects.getSelectedIndex();
        Project prj = (Project) projectsModel.get(projectIndex);
        loadTasks(prj.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1LogoEmptyPrj;
    private javax.swing.JLabel jLabelEmptySubTitle;
    private javax.swing.JLabel jLabelEmptyTitle;
    private javax.swing.JLabel jLabelIconEmoji;
    private javax.swing.JLabel jLabelProjectAdd;
    private javax.swing.JLabel jLabelTaskAdd;
    private javax.swing.JLabel jLabelTasks;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTollBarSubTitle;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelTaskList;
    private javax.swing.JPanel jPanelTitleProjects;
    private javax.swing.JPanel jPanelTitleTasks;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask(){
        //customizando o header da table tasks
        jTableTasks.getTableHeader().setFont(new Font("Noto Sans", Font.BOLD, 18));
        jTableTasks.getTableHeader().setBackground(new Color(0,102,102));
        jTableTasks.getTableHeader().setForeground(new Color(255,255,255));
        
        //criando o sort automatico
        jTableTasks.setAutoCreateRowSorter(true);
                
    }
    
    public void initDataController(){
        prjController = new ProjectController();
        tskController = new TaskController();               
    }
    
    public void initComponentsModel(){
        projectsModel = new DefaultListModel();
        loadProjects();
        tasksModel = new TaskTableModel();
        jTableTasks.setModel(tasksModel);
        
        if(!projectsModel.isEmpty()){
            jListProjects.setSelectedIndex(0);
            Project prj = (Project) projectsModel.get(0);
            loadTasks(prj.getId());
        }
    }
    
    public void loadTasks(int idProject) {
        List<Task> tasks = tskController.getAll(idProject);
        tasksModel.setTasks(tasks);
        showTableTasks(!tasks.isEmpty());
    }
    
    
    public void loadProjects(){
        List<Project> projects = prjController.getAll();
        projectsModel.clear();
        
        for(int i = 0; i < projects.size(); i++){
            Project prj = projects.get(i);
            projectsModel.addElement(prj);
        }
        jListProjects.setModel(projectsModel);        
    }
    
    
    private void showTableTasks(boolean hasTasks){
        if(hasTasks) {
            //existem tarefas
            if(jPanelEmptyList.isVisible()) {
                jPanelEmptyList.setVisible(false);
                jPanelTaskList.remove(jPanelEmptyList);
            }
            
            jPanelTaskList.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanelTaskList.getWidth(), jPanelTaskList.getHeight());
        } else {
            if (jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanelTaskList.remove(jScrollPaneTasks);
            }
            
            jPanelTaskList.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanelTaskList.getWidth(), jPanelTaskList.getHeight());
        }
    }
    
}
