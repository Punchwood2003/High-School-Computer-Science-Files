import java.awt.*;
import java.applet.*;
public class Body
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public Body(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
    {
        greenColor1 = gC1;
        greenColor2 = gC2;
        greenColor3 = gC3;
        greenColor4 = gC4;
        greenColor5 = gC5;
        greenColor6 = gC6;
        greenColor7 = gC7;
        drawBody(g);
    }
    public void drawBody(Graphics g)
    {
       g.setColor(greenColor5);
        g.fillRect(1100/2,1150/2,10/2,10/2);
        g.fillRect(1110/2,1160/2,40/2,10/2);
        g.fillRect(1110/2,1160/2,30/2,30/2);
        g.fillRect(1130/2,1190/2,20/2,40/2);
        g.fillRect(1160/2,1180/2,10/2,30/2);
        g.fillRect(1160/2,1210/2,20/2,20/2);
        g.fillRect(1140/2,1220/2,40/2,30/2);
        g.fillRect(1180/2,1230/2,10/2,30/2);
        g.fillRect(1190/2,1250/2,10/2,10/2);
        g.fillRect(1150/2,1250/2,20/2,10/2);
        g.fillRect(1150/2,1020/2,10/2,10/2);
        g.fillRect(1000/2,1230/2,20/2,10/2);
        g.fillRect(1030/2,1160/2,10/2,10/2);
        g.fillRect(1040/2,1130/2,10/2,30/2);
        g.fillRect(670/2,1070/2,10/2,20/2);
        g.fillRect(690/2,1050/2,10/2,10/2);
        g.fillRect(890/2,980/2,10/2,10/2);
        g.fillRect(950/2,910/2,10/2,10/2);
        //
        g.setColor(greenColor6);
        g.fillRect(1140/2,1170/2,20/2,20/2);
        g.fillRect(1150/2,1190/2,10/2,30/2);
        g.fillRect(1170/2,1250/2,10/2,10/2);
        g.fillRect(1140/2,1000/2,10/2,10/2);
        g.fillRect(1150/2,1010/2,10/2,10/2);
        g.fillRect(1160/2,1030/2,10/2,10/2);
        g.fillRect(1170/2,1050/2,10/2,20/2);
        g.fillRect(1180/2,1070/2,10/2,20/2);
        g.fillRect(1230/2,1000/2,10/2,10/2);
        g.fillRect(1240/2,1020/2,10/2,20/2);
        g.fillRect(1250/2,1040/2,10/2,20/2);
        g.fillRect(770/2,1010/2,10/2,10/2);
        g.fillRect(800/2,980/2,10/2,10/2);
        g.fillRect(810/2,970/2,10/2,10/2);
        g.fillRect(900/2,970/2,10/2,10/2);
        g.fillRect(940/2,900/2,20/2,10/2);
        g.fillRect(970/2,910/2,10/2,10/2);
        //
        g.setColor(greenColor4);
        g.fillRect(1230/2,1010/2,20/2,10/2);
        g.fillRect(1240/2,1040/2,10/2,10/2);
        g.fillRect(1250/2,1030/2,10/2,10/2);
        g.fillRect(1250/2,1060/2,10/2,80/2);
        g.fillRect(1180/2,1090/2,20/2,10/2);
        g.fillRect(1160/2,1070/2,20/2,20/2);
        g.fillRect(1160/2,1040/2,10/2,30/2);
        g.fillRect(1160/2,1040/2,20/2,10/2);
        g.fillRect(1170/2,1040/2,10/2,10/2);
        g.fillRect(1160/2,1020/2,10/2,10/2);
        g.fillRect(1150/2,1030/2,10/2,10/2);
        g.fillRect(1140/2,1010/2,10/2,20/2);
        g.fillRect(1130/2,1000/2,10/2,20/2);
        g.fillRect(1140/2,990/2,10/2,10/2);
        g.fillRect(1120/2,1020/2,10/2,30/2);
        g.fillRect(1180/2,1060/2,10/2,10/2);
        g.fillRect(1110/2,1050/2,10/2,30/2);
        g.fillRect(1100/2,1080/2,10/2,50/2);
        g.fillRect(1090/2,1110/2,10/2,150/2);
        g.fillRect(1110/2,1130/2,10/2,30/2);
        g.fillRect(1090/2,1140/2,30/2,10/2);
        g.fillRect(1110/2,1150/2,50/2,10/2);
        g.fillRect(1150/2,1160/2,20/2,10/2);
        g.fillRect(1160/2,1170/2,20/2,10/2);
        g.fillRect(1170/2,1180/2,20/2,30/2);
        g.fillRect(1180/2,1190/2,30/2,40/2);
        g.fillRect(1190/2,1200/2,30/2,50/2);
        g.fillRect(1200/2,1220/2,20/2,40/2);
        g.fillRect(1220/2,1210/2,10/2,10/2);
        g.fillRect(1220/2,1230/2,10/2,30/2);
        g.fillRect(1230/2,1240/2,10/2,20/2);
        g.fillRect(1110/2,1190/2,20/2,70/2);
        g.fillRect(1090/2,1160/2,20/2,100/2);
        g.fillRect(1130/2,1230/2,10/2,30/2);
        g.fillRect(1140/2,1250/2,10/2,10/2);
        g.fillRect(1090/2,1150/2,10/2,110/2);
        g.fillRect(1080/2,1150/2,10/2,60/2);
        g.fillRect(1080/2,1220/2,10/2,40/2);
        g.fillRect(1070/2,1220/2,10/2,30/2);
        g.fillRect(1060/2,1210/2,10/2,20/2);
        g.fillRect(1070/2,1200/2,10/2,10/2);
        g.fillRect(1070/2,1180/2,10/2,10/2);
        g.fillRect(1050/2,1110/2,10/2,90/2);
        g.fillRect(1060/2,1150/2,10/2,50/2);
        g.fillRect(1040/2,1160/2,10/2,20/2);
        g.fillRect(1040/2,1110/2,20/2,20/2);
        g.fillRect(990/2,1110/2,70/2,10/2);
        g.fillRect(990/2,1230/2,10/2,10/2);
        g.fillRect(1020/2,1230/2,20/2,10/2);
        g.fillRect(930/2,1230/2,40/2,10/2);
        g.fillRect(920/2,1250/2,50/2,10/2);
        g.fillRect(830/2,1230/2,80/2,10/2);
        g.fillRect(800/2,1230/2,20/2,10/2);
        g.fillRect(770/2,1230/2,20/2,10/2);
        g.fillRect(720/2,1230/2,20/2,10/2);
        g.fillRect(780/2,1110/2,40/2,10/2);
        g.fillRect(770/2,1020/2,10/2,10/2);
        g.fillRect(670/2,1090/2,30/2,10/2);
        g.fillRect(690/2,1100/2,10/2,10/2);
        g.fillRect(680/2,1060/2,20/2,20/2);
        g.fillRect(670/2,1030/2,10/2,40/2);
        g.fillRect(900/2,980/2,10/2,10/2);
        g.fillRect(650/2,1230/2,10/2,10/2);
        
        g.setColor(greenColor3);
        g.fillRect(1240/2,1120/2,10/2,10/2);
        g.fillRect(1130/2,1020/2,10/2,30/2);
        g.fillRect(1140/2,1030/2,10/2,20/2);
        g.fillRect(1150/2,1040/2,10/2,10/2);
        g.fillRect(1120/2,1050/2,40/2,30/2);
        g.fillRect(1110/2,1080/2,50/2,50/2);
        g.fillRect(1080/2,1140/2,10/2,10/2);
        g.fillRect(1100/2,1130/2,10/2,10/2);
        g.fillRect(1120/2,1130/2,110/2,20/2);
        g.fillRect(1160/2,1090/2,20/2,70/2);
        g.fillRect(1180/2,1100/2,20/2,80/2);
        g.fillRect(1170/2,1160/2,10/2,10/2);
        g.fillRect(1200/2,1110/2,10/2,20/2);
        g.fillRect(1200/2,1120/2,20/2,10/2);
        g.fillRect(1230/2,1210/2,30/2,30/2);
        g.fillRect(1220/2,1220/2,10/2,10/2);
        g.fillRect(1240/2,1240/2,20/2,20/2);
        g.fillRect(1220/2,1200/2,40/2,10/2);
        g.fillRect(1210/2,1190/2,50/2,10/2);
        g.fillRect(1190/2,1180/2,70/2,10/2);
        g.fillRect(1180/2,1170/2,80/2,10/2);
        g.fillRect(1170/2,1160/2,80/2,10/2);
        g.fillRect(1160/2,1150/2,80/2,10/2);
        g.fillRect(1120/2,1130/2,110/2,20/2);
        g.fillRect(1230/2,1140/2,10/2,10/2);
        g.fillRect(1180/2,920/2,10/2,10/2);
        g.fillRect(1160/2,930/2,20/2,10/2);
        g.fillRect(1040/2,920/2,70/2,10/2);
        g.fillRect(980/2,920/2,10/2,10/2);
        g.fillRect(1100/2,1130/2,10/2,10/2);
        g.fillRect(1080/2,1140/2,10/2,10/2);
        g.fillRect(1070/2,1170/2,10/2,10/2);
        g.fillRect(1070/2,1190/2,10/2,10/2);
        g.fillRect(1070/2,1210/2,20/2,10/2);
        g.fillRect(1050/2,1200/2,20/2,10/2);
        g.fillRect(1050/2,1200/2,10/2,30/2);
        g.fillRect(1040/2,1230/2,30/2,30/2);
        g.fillRect(1070/2,1250/2,10/2,10/2);
        g.fillRect(1010/2,1240/2,30/2,20/2);
        g.fillRect(990/2,1240/2,20/2,10/2);
        g.fillRect(970/2,1230/2,20/2,30/2);
        g.fillRect(930/2,1240/2,40/2,10/2);
        g.fillRect(910/2,1230/2,20/2,20/2);
        g.fillRect(760/2,1240/2,140/2,20/2);
        g.fillRect(900/2,1250/2,20/2,10/2);
        g.fillRect(820/2,1230/2,10/2,10/2);
        g.fillRect(780/2,1230/2,20/2,10/2);
        g.fillRect(740/2,11230/2,30/2,10/2);
        g.fillRect(740/2,1230/2,10/2,30/2);
        g.fillRect(750/2,1250/2,10/2,10/2);
        g.fillRect(730/2,1240/2,10/2,10/2);
        g.fillRect(710/2,1110/2,30/2,10/2);
        g.fillRect(680/2,1040/2,20/2,10/2);
        g.fillRect(680/2,1040/2,10/2,20/2);
        g.fillRect(770/2,1060/2,10/2,20/2);
        g.fillRect(820/2,1110/2,70/2,10/2);
        g.fillRect(960/2,1110/2,30/2,10/2);
        g.fillRect(740/2,1230/2,30/2,10/2);
        g.fillRect(930/2,1110/2,30/2,10/2);
        g.fillRect(890/2,1110/2,10/2,10/2);
        g.fillRect(860/2,1100/2,10/2,10/2);
        g.fillRect(710/2,1230/2,10/2,10/2);
        g.fillRect(660/2,1230/2,10/2,10/2);
        
        g.setColor(greenColor2);
        g.fillRect(990/2,1250/2,20/2,10/2);
        g.fillRect(900/2,1240/2,10/2,10/2);
        g.fillRect(900/2,1110/2,30/2,10/2);
        g.fillRect(750/2,1240/2,10/2,10/2);
        g.fillRect(670/2,1230/2,40/2,10/2);
        g.fillRect(680/2,1240/2,50/2,10/2);
        g.fillRect(670/2,1250/2,70/2,10/2);
        g.fillRect(650/2,1240/2,10/2,20/2);
        g.fillRect(690/2,1110/2,20/2,10/2);
        g.fillRect(700/2,1100/2,10/2,20/2);
        g.fillRect(680/2,1080/2,20/2,10/2);
        g.fillRect(740/2,1110/2,40/2,10/2);
        g.fillRect(760/2,1100/2,20/2,10/2);
        g.fillRect(770/2,1080/2,10/2,20/2);
        g.fillRect(770/2,1030/2,10/2,30/2);
        g.fillRect(770/2,1000/2,10/2,10/2);
        g.fillRect(790/2,980/2,10/2,10/2);
        g.fillRect(800/2,970/2,10/2,10/2);
        g.fillRect(810/2,960/2,20/2,10/2);
        g.fillRect(820/2,950/2,10/2,20/2);
        g.fillRect(900/2,1110/2,30/2,10/2);
        
        g.setColor(greenColor1);
        g.fillRect(660/2,1240/2,20/2,10/2);
        g.fillRect(660/2,1240/2,10/2,20/2);
        g.fillRect(870/2,880/2,20/2,10/2);
    }
}