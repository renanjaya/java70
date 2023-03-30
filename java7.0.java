import java.awt.FlowLayout;
import Java.awt.Container;
import Java.awt.event.ActionListener;
import Java.awt.event.ActionEvent;
import Java.swing.JFrame;
import Java.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
    private JButton leftButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FloeLayout layout;
    private Container container;


    public FlowLayoutFrame()
    {
        super( "FlowLayout Demo" ) ;

layout = new FlowLayout();
container = getContentPane ();
setLayout( layout ) ;


leftJButton = new JButton("Left");
add( leftJButton );
leftJButton.addActionListener(

new ActionListener()
{
    
    public void actionPerformed( ActionEvent event)
    {




    }
}
    
};



centerJButton = new JButton("center"); 
add( centerJButton );
centerJButton.addActionListener(
    new ActionListener()
    {

        public void actionPerformed( ActionEvent )
        {




        }
    }
);


rightJButton = new  JButton( "Right" );
add( rightJButton );
rightJButton.addActionListener(

    new ActionListener()
    {

        public void actionPerformed( ActionEvent event )
        {
            layout.setAlignment( FlowLayout.RIGHT );

            layout.layoutContainer( container );
        }
    }
);
}
}

    

