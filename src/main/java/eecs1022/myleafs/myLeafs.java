package eecs1022.myleafs;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class myLeafs extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_leafs);
    }

    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }
    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    public void buttonGetLines(View view){

        String getLineString = getItemSelected(R.id.spinnerLine);
        //Lines......
        String lineOne = "Matthews(34)-Marleau(12)-Kapanen(24)";
        String lineTwo = "Marner(16)-Tavares(91)-Hyman(11)";
        String lineThree = "Kadri(43)-Brown(28)-Lindholm(26)";
        String lineFour = "Ennis(63)-Gauthier(33)-Leivo(32)";
        String D1 = "Rielly(44)-Hainsey(2)";
        String D2 = "Gardiner(51)-Zaitsev(22)";
        String D3 = "Dermott(23)-Ozhiganov(92)";
        String PPOne = "Marner(16)-Kadri(43)-Matthews(34)-Tavares(91)-Rielly(44)";
        String PPTwo = "Hyman(11)-Ennis(63)-Kapanen(24)-Brown(28)-Gardiner(51)";

        if(getLineString.equals("Line 1")){
            setContentsOfTextView(R.id.lineReturn, lineOne);
        }
        else if(getLineString.equals("Line 2")){
            setContentsOfTextView(R.id.lineReturn, lineTwo);
        }
        else if(getLineString.equals("Line 3")){
            setContentsOfTextView(R.id.lineReturn, lineThree);
        }
        else if(getLineString.equals("Line 4")) {
            setContentsOfTextView(R.id.lineReturn, lineFour);
        }
        else if(getLineString.equals("1st power-play Unit")){
            setContentsOfTextView(R.id.lineReturn, PPOne);
        }
        else if(getLineString.equals("2nd power-play Unit")){
            setContentsOfTextView(R.id.lineReturn, PPTwo);
        }
        else if(getLineString.equals("Defencive Pairing 1")){
            setContentsOfTextView(R.id.lineReturn, D1);
        }
        else if(getLineString.equals("Defencive Pairing 2")){
            setContentsOfTextView(R.id.lineReturn, D2);
        }
        else if(getLineString.equals("Defencive Pairing 3")){
            setContentsOfTextView(R.id.lineReturn, D3);
        }
        else{
            setContentsOfTextView(R.id.lineReturn, "Please Select Lineup!");
        }
    }

    public void buttonGetPlayerInfo(View view){
        String numSelected = getInputOfTextField(R.id.pN);
        int num = Integer.parseInt(numSelected);

        if(numSelected.equals(null)){
            setContentsOfTextView(R.id.playerName, "Nothing Entered!");
            setContentsOfTextView(R.id.playerPosition, "Position: N/A");
        }
        else if(num == 34){
            setContentsOfTextView(R.id.playerName, "Auston Matthews");
            setContentsOfTextView(R.id.playerPosition, "Position: Center");
        }
        else if(num == 26){
            setContentsOfTextView(R.id.playerName, "Par Lindholm");
            setContentsOfTextView(R.id.playerPosition, "Position: Left-wing");
        }
        else if(num == 29){
            setContentsOfTextView(R.id.playerName, "William Nylander");
            setContentsOfTextView(R.id.playerPosition, "Position: Center");
        }
        else if(num == 52){
            setContentsOfTextView(R.id.playerName, "Martin Marincin");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 16){
            setContentsOfTextView(R.id.playerName, "Mitchell Marner");
            setContentsOfTextView(R.id.playerPosition, "Position: Right-wing");
        }
        else if(num == 51){
            setContentsOfTextView(R.id.playerName, "Jake Gardiner");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 11){
            setContentsOfTextView(R.id.playerName, "Zach Hyman");
            setContentsOfTextView(R.id.playerPosition, "Position: Left-wing");
        }
        else if(num == 28){
            setContentsOfTextView(R.id.playerName, "Connor Brown");
            setContentsOfTextView(R.id.playerPosition, "Position: Right-wing");
        }
        else if(num == 3){
            setContentsOfTextView(R.id.playerName, "Justin Holl");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 43){
            setContentsOfTextView(R.id.playerName, "Nazem Kadri");
            setContentsOfTextView(R.id.playerPosition, "Position: Center");
        }
        else if(num == 91){
            setContentsOfTextView(R.id.playerName, "John Tavares(A)");
            setContentsOfTextView(R.id.playerPosition, "Position: Center");
        }
        else if(num == 24){
            setContentsOfTextView(R.id.playerName, "Kasperi Kapanen");
            setContentsOfTextView(R.id.playerPosition, "Position: Right-wing");
        }
        else if(num == 44){
            setContentsOfTextView(R.id.playerName, "Morgan Rielly(A)");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 12){
            setContentsOfTextView(R.id.playerName, "Patrick Marleau(A)");
            setContentsOfTextView(R.id.playerPosition, "Position: Left-wing");
        }
        else if(num == 22){
            setContentsOfTextView(R.id.playerName, "Nikita Zaitsev");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 23){
            setContentsOfTextView(R.id.playerName, "Tyler Dermott");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 2){
            setContentsOfTextView(R.id.playerName, "Ron Hainsey");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        else if(num == 32){
            setContentsOfTextView(R.id.playerName, "Josh Leivo");
            setContentsOfTextView(R.id.playerPosition, "Position: Left-wing");
        }
        else if(num == 33){
            setContentsOfTextView(R.id.playerName, "Frederik Gauthier");
            setContentsOfTextView(R.id.playerPosition, "Position: Center");
        }
        else if(num == 63){
            setContentsOfTextView(R.id.playerName, "Tyler Ennis");
            setContentsOfTextView(R.id.playerPosition, "Position: Right-wing");
        }
        else if(num == 18){
            setContentsOfTextView(R.id.playerName, "Andreas Johnsson");
            setContentsOfTextView(R.id.playerPosition, "Position: Left-wing");
        }
        else if(num == 31){
            setContentsOfTextView(R.id.playerName, "Frederik Andersen");
            setContentsOfTextView(R.id.playerPosition, "Position: Goalie");
        }
        else if(num == 92){
            setContentsOfTextView(R.id.playerName, "Igor Ozhiganov");
            setContentsOfTextView(R.id.playerPosition, "Position: Defence");
        }
        /*else if(num == 35){
            setContentsOfTextView(R.id.playerName, "Curtis McElhinney");
            setContentsOfTextView(R.id.playerPosition, "Position: Goalie");
        }*/
        else if(num == 40){
            setContentsOfTextView(R.id.playerName, "Garret Sparks");
            setContentsOfTextView(R.id.playerPosition, "Position: Goalie");
        }

        /*else if(num == 30){
            setContentsOfTextView(R.id.playerName, "Calvin Pickard");
            setContentsOfTextView(R.id.playerPosition, "Position: Goalie");
        }*/
        else {
            setContentsOfTextView(R.id.playerName, "# Not in the Lineup!");
            setContentsOfTextView(R.id.playerPosition, "Position: N/A");
        }
    }

    public void onMusicStart(View view){
        if(mediaPlayer == null)
            mediaPlayer = MediaPlayer.create(this, R.raw.horn);
            mediaPlayer.start();
    }

    public void onVicPlay(View view){
        if(mediaPlayer == null)
        mediaPlayer = MediaPlayer.create(this, R.raw.victorysong);
        mediaPlayer.start();
    }
    public void onVicPause(View view){
        mediaPlayer.pause();
        length = mediaPlayer.getCurrentPosition();
    }
    public void onVicStop(View view){
        mediaPlayer.stop();
        mediaPlayer = null;
    }
    public void onResume(View view){
         mediaPlayer.seekTo(length);
        mediaPlayer.start();
    }

    public void onIntroClick(View view){
        if(mediaPlayer == null)
        mediaPlayer = MediaPlayer.create(this, R.raw.newman);
        mediaPlayer.start();
    }

    public void onprimintro(View view){
        if(mediaPlayer == null)
            mediaPlayer = MediaPlayer.create(this, R.raw.pump);
        mediaPlayer.start();
    }

    public void onPowerPlay(View view){
        if(mediaPlayer == null)
            mediaPlayer = MediaPlayer.create(this, R.raw.power);
        mediaPlayer.start();
    }


}
