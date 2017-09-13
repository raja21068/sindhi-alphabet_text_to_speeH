
package net.viralpatel.android.speechtotextdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnInitListener {

	protected static final int RESULT_SPEECH = 1;
	private ImageButton btnSpeak;
	private TextView txtText;
	private ImageView viewimg;
	private Button seeallbtn;
	private Spinner spinner;
	private Button wordbtn;
	private TextToSpeech tts;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtText = (TextView) findViewById(R.id.txtText);
		viewimg=(ImageView)findViewById(R.id.imageView1);
		btnSpeak = (ImageButton) findViewById(R.id.btnSpeak);
		seeallbtn=(Button)findViewById(R.id.seeallbtn);
		spinner = (Spinner) findViewById(R.id.spinner);
		tts = new TextToSpeech(this, this);
		ArrayAdapter<String> adapter;
	    
	    wordbtn=(Button)findViewById(R.id.wordbtn);
		
		
		
		btnSpeak.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
				intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
				try {
					startActivityForResult(intent, RESULT_SPEECH);
					txtText.setText("");
				} catch (ActivityNotFoundException a) {
					Toast t = Toast.makeText(getApplicationContext(),
							"Ops! Your device doesn't support Speech to Text",
							Toast.LENGTH_SHORT);
					t.show();
				}
			}
		});
		seeallbtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				viewimg.setImageResource(R.drawable.fullalphabets);
			}
		});
	
		wordbtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String alphabet=spinner.getSelectedItem().toString();
				String text ="";
				
				if(alphabet.equals("\u0627")){
					viewimg.setImageResource(R.drawable.pic1);
					text="alif";
				}
				else if(alphabet.equals("\u0628")){
					viewimg.setImageResource(R.drawable.pic2);
					text="beh";
				}
			    else if(alphabet.equals("\u067B")){
			    	viewimg.setImageResource(R.drawable.pic3);
			    	text="beeh";
			    }
			    else if(alphabet.equals("\u0680")){
			    	viewimg.setImageResource(R.drawable.pic4);
			    	text="beheh";
			    }
			    else if(alphabet.equals("\u067C")){
			    	viewimg.setImageResource(R.drawable.pic5);
			    	text="teh";
			    }
			    else if(alphabet.equals("\u067F")){
			    	viewimg.setImageResource(R.drawable.pic6);
			    	text="teheh";
			    }
			    else if(alphabet.equals("\u067D")){
			    	viewimg.setImageResource(R.drawable.pic7);
			    	text="teh";
			    }
			    else if(alphabet.equals("\u067A")){
			    	viewimg.setImageResource(R.drawable.pic8);
			    	text="tteheh";
			    }
			    else if(alphabet.equals("\u062B")){
			    	viewimg.setImageResource(R.drawable.pic9);
			    	text="theh";
			    }
			    else if(alphabet.equals("\u067E")){
			    	viewimg.setImageResource(R.drawable.pic10);
			    	text="peh";
			    }
			    else if(alphabet.equals("\u062C")){
			    	viewimg.setImageResource(R.drawable.pic11);
			    	text="jeem";
			    }
			    else if(alphabet.equals("\u0684")){
			    	viewimg.setImageResource(R.drawable.pic12);
			    	text="dyeh";
			    }
			    else if(alphabet.equals("oooooooooooooo")){
			    	viewimg.setImageResource(R.drawable.pic13);
			    	text="jha";
			    }
			    else if(alphabet.equals("\u0683")){
			    	viewimg.setImageResource(R.drawable.pic14);
			    	text="nyeh";
			    }
			    else if(alphabet.equals("\u0686")){
			    	viewimg.setImageResource(R.drawable.pic15);
			    	text="tcheh";
			    }
			    else if(alphabet.equals("\u0687")){
			    	viewimg.setImageResource(R.drawable.pic16);
			    	text="tcheheh";
			    }
			    else if(alphabet.equals("\u062D")){
			    	viewimg.setImageResource(R.drawable.pic17);
			    	text="hah";
			    }
			    else if(alphabet.equals("\u062E")){
			    	viewimg.setImageResource(R.drawable.pic18);
			    	text="khah";
			    }
			    else if(alphabet.equals("\u062F")){
			    	viewimg.setImageResource(R.drawable.pic19);
			    	text="dal";
			    }
			    else if(alphabet.equals("\u068C")){
			    	viewimg.setImageResource(R.drawable.pic20);
			    	text="dahal";
			    }
			    else if(alphabet.equals("\u068F")){
			    	viewimg.setImageResource(R.drawable.pic21);
			    	text="dal";
			    }
			    else if(alphabet.equals("\u068A")){
			    	viewimg.setImageResource(R.drawable.pic22);
			    	text="dalwithdot";
			    }
			    else if(alphabet.equals("\u068D")){
			    	viewimg.setImageResource(R.drawable.pic23);
			    	text="ddahal";
			    }
			    else if(alphabet.equals("\u0630")){
			    	viewimg.setImageResource(R.drawable.pic24);
			    	text="thal";
			    }
			    else if(alphabet.equals("\u0631")){
			    	viewimg.setImageResource(R.drawable.pic25);
			    	text="reh";
			    }
			    else if(alphabet.equals("\u0699")){
			    	viewimg.setImageResource(R.drawable.pic26);
			    	text="rehwith4dots";
			    }
			    else if(alphabet.equals("\u0632")){
			    	viewimg.setImageResource(R.drawable.pic27);
			    	text="zain";
			    }
			    else if(alphabet.equals("\u0633")){
			    	viewimg.setImageResource(R.drawable.pic28);
			    	text="seen";
			    }
			    else if(alphabet.equals("\u0634")){
			    	viewimg.setImageResource(R.drawable.pic29);
			    	text="sheen";
			    }
			    else if(alphabet.equals("\u0635")){
			    	viewimg.setImageResource(R.drawable.pic30);
			    	text="sad";
			    }
			    else if(alphabet.equals("\u0636")){
			    	viewimg.setImageResource(R.drawable.pic31);
			    	text="dad";
			    }
			    else if(alphabet.equals("\u0637")){
			    	viewimg.setImageResource(R.drawable.pic32);
			    	text="tah";
			    }
			    else if(alphabet.equals("\u0638")){
			    	viewimg.setImageResource(R.drawable.pic33);
			    	text="zah";
			    }
			    else if(alphabet.equals("\u0639")){
			    	viewimg.setImageResource(R.drawable.pic34);
			    	text="ain";
			    }
			    else if(alphabet.equals("\u063A")){
			    	viewimg.setImageResource(R.drawable.pic35);
			    	text="ghain";
			    }
			    else if(alphabet.equals("\u0641")){
			    	viewimg.setImageResource(R.drawable.pic36);
			    	text="feh";
			    }
			    else if(alphabet.equals("\u06A6")){
			    	viewimg.setImageResource(R.drawable.pic37);
			    	text="peheh";
			    }
			    else if(alphabet.equals("\u0642")){
			    	viewimg.setImageResource(R.drawable.pic38);
			    	text="qaf";
			    }
			    else if(alphabet.equals("\u06AA")){
			    	viewimg.setImageResource(R.drawable.pic39);
			    	text="swash";
			    }
			    else if(alphabet.equals("\u06A9")){
			    	viewimg.setImageResource(R.drawable.pic40);
			    	text="keheh";
			    }
			    else if(alphabet.equals("\u06AF")){
			    	viewimg.setImageResource(R.drawable.pic41);
			    	text="gaf";
			    }
			    else if(alphabet.equals("\u06B3")){
			    	viewimg.setImageResource(R.drawable.pic42);
			    	text="gueh";
			    }
			    else if(alphabet.equals("ooooooooooooooooooo")){
			    	viewimg.setImageResource(R.drawable.pic43);
			    	text="gha";
			    }
			    else if(alphabet.equals("\u06B1")){
			    	viewimg.setImageResource(R.drawable.pic44);
			    	text="ngoeh";
			    }
			    else if(alphabet.equals("\u0644")){
			    	viewimg.setImageResource(R.drawable.pic45);
			    	text="lam";
			    }
			    else if(alphabet.equals("\u0645")){
			    	viewimg.setImageResource(R.drawable.pic46);
			    	text="meem";
			    }
			    else if(alphabet.equals("\u0646")){
			    	viewimg.setImageResource(R.drawable.pic47);
			    	text="noon";
			    }
			    else if(alphabet.equals("\u06BB")){
			    	viewimg.setImageResource(R.drawable.pic48);
			    	text="Rnoon";
			    }
			    else if(alphabet.equals("\u0648")){
			    	viewimg.setImageResource(R.drawable.pic49);
			    	text="waw";
			    }
			    else if(alphabet.equals("\u06BE")){
			    	viewimg.setImageResource(R.drawable.pic50);
			    	text="heh";
			    }
			    else if(alphabet.equals("\u06FD")){
			    	//viewimg.setImageResource(R.drawable.pic51);
			    	text="alif nandhro";
			    }
			    else if(alphabet.equals("\u064A")){
			    	viewimg.setImageResource(R.drawable.pic52);
			    	text="yeh";
			    }
				if (tts!=null) {
					if (text!=null) {
						if (!tts.isSpeaking()) {
							tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
						}
					}
				}
			}
		});
		/*spinner.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String alphabet=spinner.getSelectedItem().toString();
				if(alphabet.equals("\u0627")){
					viewimg.setImageResource(R.drawable.pic1);
				}
			    else if(alphabet.equals("\u0628")){
			    	
			    	
			    }
			    else if(alphabet.equals("\u067B")){}
			    else if(alphabet.equals("\u0680")){}
			    else if(alphabet.equals("\u067C")){}
			    else if(alphabet.equals("\u067F")){}
			    else if(alphabet.equals("\u067D")){}
			    else if(alphabet.equals("\u067A")){}
			    else if(alphabet.equals("\u062B")){}
			    else if(alphabet.equals("\u067E")){}
			    else if(alphabet.equals("\u062C")){}
			    else if(alphabet.equals("\u0684")){}
			    else if(alphabet.equals("oooooooooooooo")){}
			    else if(alphabet.equals("\u0683")){}
			    else if(alphabet.equals("\u0686")){}
			    else if(alphabet.equals("\u0687")){}
			    else if(alphabet.equals("\u062D")){}
			    else if(alphabet.equals("\u062E")){}
			    else if(alphabet.equals("\u062F")){}
			    else if(alphabet.equals("\u068C")){}
			    else if(alphabet.equals("\u068F")){}
			    else if(alphabet.equals("\u068A")){}
			    else if(alphabet.equals("\u068D")){}
			    else if(alphabet.equals("\u0630")){}
			    else if(alphabet.equals("\u0631")){}
			    else if(alphabet.equals("\u0699")){}
			    else if(alphabet.equals("\u0632")){}
			    else if(alphabet.equals("\u0633")){}
			    else if(alphabet.equals("\u0634")){}
			    else if(alphabet.equals("\u0635")){}
			    else if(alphabet.equals("\u0636")){}
			    else if(alphabet.equals("\u0637")){}
			    else if(alphabet.equals("\u0638")){}
			    else if(alphabet.equals("\u0639")){}
			    else if(alphabet.equals("\u063A")){}
			    else if(alphabet.equals("\u0641")){}
			    else if(alphabet.equals("\u06A6")){}
			    else if(alphabet.equals("\u0642")){}
			    else if(alphabet.equals("\u06AA")){}
			    else if(alphabet.equals("\u06A9")){}
			    else if(alphabet.equals("\u06AF")){}
			    else if(alphabet.equals("\u06B3")){}
			    else if(alphabet.equals("ooooooooooooooooooo")){}
			    else if(alphabet.equals("\u06B1")){}
			    else if(alphabet.equals("\u0644")){}
			    else if(alphabet.equals("\u0645")){}
			    else if(alphabet.equals("\u0646")){}
			    else if(alphabet.equals("\u06BB")){}
			    else if(alphabet.equals("\u0648")){}
			    else if(alphabet.equals("\u06BE")){}
			    else if(alphabet.equals("\u06FD")){}
			    else if(alphabet.equals("\u064A")){}
			
			}
		}); */
		
		
	    
	    String alif="\u0627";
	    String beh="\u0628";
	    String beeh="\u067B";
	    String beheh="\u0680";
	    String teh="\u067C";
	    String teheh="\u067F";
	    String teh1="\u067D";
	    String tteheh="\u067A";
	    String theh="\u062B";
	    String peh="\u067E";
	    String jeem="\u062C";
	    String dyeh="\u0684";
	    //missing jha
	    String nyeh="\u0683";
	    String tcheh="\u0686";
	    String tcheheh="\u0687";
	    String hah="\u062D";
	    String khah="\u062E";
	    String dal="\u062F";
	    String dahal="\u068C";
	    String dal1="\u068F";
	    String dalwithdot="\u068A";
	    String ddahal="\u068D";
	    String thal="\u0630";
	    String reh="\u0631";
	    String rehwith4dots="\u0699";
	    String zain="\u0632";
	    String seen="\u0633";
	    String sheen="\u0634";
	    String sad="\u0635";
	    String dad="\u0636";
	    String tah="\u0637";
	    String zah="\u0638";
	    String ain="\u0639";
	    String ghain="\u063A";
	    String feh="\u0641";
	    String peheh="\u06A6";
	    String qaf="\u0642";
	    String swash="\u06AA";
	    String keheh="\u06A9";
	    String gaf="\u06AF";
	    String gueh="\u06B3";
	    //missing gha
	    String ngoeh="\u06B1";
	    String lam="\u0644";
	    String meem="\u0645";
	    String noon="\u0646";
	    String Rnoon="\u06BB";
	    String waw="\u0648";
	    String heh="\u06BE";
	    String arabicsignsindhiampersand="\u06FD";
	    String yeh="\u064A";
	    
	    
	    List<String> list;
	    list = new ArrayList<String>();
	    list.add(alif);
	    list.add(beh);
	    list.add(beeh);
	    list.add(beheh);
	    list.add(teh);
	    list.add(teheh);
	    list.add(teh1);
	    list.add(tteheh);
	    list.add(theh);
	    list.add(peh);
	    list.add(jeem);
	    list.add(dyeh);
	    //missing jha
	    list.add(nyeh);
	    list.add(tcheh);
	    list.add(tcheheh);
	    list.add(hah);
	    list.add(khah);
	    list.add(dal);
	    list.add(dahal);
	    list.add(dal1);
	    list.add(dalwithdot);
	    list.add(ddahal);
	    list.add(thal);
	    list.add(reh);
	    list.add(rehwith4dots);
	    list.add(zain);
	    list.add(seen);
	    list.add(sheen);
	    list.add(sad);
	    list.add(dad);
	    list.add(tah);
	    list.add(zah);
	    list.add(ain);
	    list.add(ghain);
	    list.add(feh);
	    list.add(peheh);
	    list.add(qaf);
	    list.add(swash);
	    list.add(keheh);
	    list.add(gaf);
	    list.add(gueh);
	    //missing gha
	    list.add(ngoeh);
	    list.add(lam);
	    list.add(meem);
	    list.add(noon);
	    list.add(Rnoon);
	    list.add(waw);
	    list.add(heh);
	    list.add(arabicsignsindhiampersand);
	    list.add(yeh);
	    
	    
	    adapter = new ArrayAdapter<String>(getApplicationContext(),
	            android.R.layout.simple_spinner_item, list);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner.setAdapter(adapter);
		
	    

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		case RESULT_SPEECH: {
			if (resultCode == RESULT_OK && null != data) {

				ArrayList<String> text = data
						.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
				String textt=text.get(0);
				if(textt.equalsIgnoreCase("i live") || textt.equalsIgnoreCase("i just") || textt.equalsIgnoreCase("i miss") || textt.equalsIgnoreCase("i guess") || textt.equalsIgnoreCase("unless")){
					txtText.setText("alif");
					viewimg.setImageResource(R.drawable.a);
				}
				else if(textt.equalsIgnoreCase("bitch") || textt.equalsIgnoreCase("big")){
					txtText.setText("beh");
					viewimg.setImageResource(R.drawable.b);
				}
				else if(textt.equalsIgnoreCase("bay")){
					txtText.setText("beeh");
					viewimg.setImageResource(R.drawable.c);
				}
				else if(textt.equalsIgnoreCase("moon") || textt.equalsIgnoreCase("dale")){
					txtText.setText("beheh");
					viewimg.setImageResource(R.drawable.d);
				}
				else if(textt.equalsIgnoreCase("did")||textt.equalsIgnoreCase("dead") || textt.equalsIgnoreCase("t") || textt.equalsIgnoreCase("dick") | textt.equalsIgnoreCase("they")){
					txtText.setText("teh");
					viewimg.setImageResource(R.drawable.e);
				}
				else if(textt.equalsIgnoreCase("k") || textt.equalsIgnoreCase("hey")){
					Toast.makeText(getApplicationContext(), "Same Akcent Alphabets", Toast.LENGTH_SHORT).show();
					txtText.setText("tehen , ttetheh , khe and khah");
					viewimg.setImageResource(R.drawable.fhran);
				}
				else if(textt.equalsIgnoreCase("dave") || textt.equalsIgnoreCase("day") || textt.equalsIgnoreCase("gay")){
					txtText.setText("teh and dae");
					viewimg.setImageResource(R.drawable.gu);
				}
				else if(textt.equalsIgnoreCase("say")){
					txtText.setText("saay");
					viewimg.setImageResource(R.drawable.i);
				}
				else if(textt.equalsIgnoreCase("big") || textt.equalsIgnoreCase("p") || textt.equalsIgnoreCase("pay") || textt.equalsIgnoreCase("paint")){
					txtText.setText("peh");
					viewimg.setImageResource(R.drawable.j);
				}
				else if (textt.equalsIgnoreCase("game") || textt.equalsIgnoreCase("jean") || textt.equalsIgnoreCase("dean")){
					txtText.setText("jeem");
					viewimg.setImageResource(R.drawable.k);
				}
				//text
				else if (textt.equalsIgnoreCase("yes") || textt.equalsIgnoreCase("a") || textt.equalsIgnoreCase("s")){
					txtText.setText("dyeh");
					viewimg.setImageResource(R.drawable.l);
				}
				else if (textt.equalsIgnoreCase("just") || textt.equalsIgnoreCase("gas") || textt.equalsIgnoreCase("yeah") || textt.equalsIgnoreCase("j")){
					txtText.setText("jha");
					viewimg.setImageResource(R.drawable.m);
				}
				else if(textt.equalsIgnoreCase("man") || textt.equalsIgnoreCase("mia") || textt.equalsIgnoreCase("nude")){
					txtText.setText("nyeh");
					viewimg.setImageResource(R.drawable.n);
				}
				else if (textt.equalsIgnoreCase("jenna") || textt.equalsIgnoreCase("j a") || textt.equalsIgnoreCase("jeff") || textt.equalsIgnoreCase("jess")){
					txtText.setText("tcheh");
					viewimg.setImageResource(R.drawable.o);
				}
				else if(textt.equalsIgnoreCase("che") || textt.equalsIgnoreCase("soon") || textt.equalsIgnoreCase("chain") || textt.equalsIgnoreCase("home") || textt.equalsIgnoreCase("t a") || textt.equalsIgnoreCase("chase") || textt.equalsIgnoreCase("text") || textt.equalsIgnoreCase("chiea")){
					txtText.setText("tcheheh");
					viewimg.setImageResource(R.drawable.p);
				}
				else if(textt.equalsIgnoreCase("ha") || textt.equalsIgnoreCase("hi")){
					txtText.setText("hah");
					viewimg.setImageResource(R.drawable.qax);
					
				}
				else if(textt.equalsIgnoreCase("don") || textt.equalsIgnoreCase("dont") || textt.equalsIgnoreCase("got it") || textt.equalsIgnoreCase("docs") || textt.equalsIgnoreCase("done")){
					txtText.setText("dal , dadal , ");
					viewimg.setImageResource(R.drawable.s);
				}
				else if(textt.equalsIgnoreCase("seen") || textt.equalsIgnoreCase("then") || textt.equalsIgnoreCase("team")){
					txtText.setText("seen");
					viewimg.setImageResource(R.drawable.ab);
				}
				else if(textt.equalsIgnoreCase("sheen") || textt.equalsIgnoreCase("shine")){
					txtText.setText("sheen");
					viewimg.setImageResource(R.drawable.ac);
				}
				else if(textt.equalsIgnoreCase("slide") || textt.equalsIgnoreCase("flying") || textt.equalsIgnoreCase("sod") || textt.equalsIgnoreCase("allied") || textt.equalsIgnoreCase("arrived")){
					txtText.setText("sad");
					viewimg.setImageResource(R.drawable.ad);
				}
				else if(textt.equalsIgnoreCase("what") ||textt.equalsIgnoreCase("rod")){
					txtText.setText("zad");
					viewimg.setImageResource(R.drawable.ae);
				}
				else if(textt.equalsIgnoreCase("lee") || textt.equalsIgnoreCase("wake") || textt.equalsIgnoreCase("do 8") || textt.equalsIgnoreCase("do a") || textt.equalsIgnoreCase("away") || textt.equalsIgnoreCase("awake")){
					txtText.setText("tah");
					viewimg.setImageResource(R.drawable.af);
				}
				else if (textt.equalsIgnoreCase("silly") || textt.equalsIgnoreCase("sway") || textt.equalsIgnoreCase("swift")){
					txtText.setText("zah");
					viewimg.setImageResource(R.drawable.ag);
				}
				else if(textt.equalsIgnoreCase("in")||textt.equalsIgnoreCase("n") || textt.equalsIgnoreCase("and")){
					txtText.setText("ean");
					viewimg.setImageResource(R.drawable.ah);
				}
				else if(textt.equalsIgnoreCase("gin") || textt.equalsIgnoreCase("give") || textt.equalsIgnoreCase("dang") || textt.equalsIgnoreCase("give") || textt.equalsIgnoreCase("gain") || textt.equalsIgnoreCase("again")){
					txtText.setText("ghain");
					viewimg.setImageResource(R.drawable.ai);
				}
				else if(textt.equalsIgnoreCase("c")){
					txtText.setText("feh and peheh");
					viewimg.setImageResource(R.drawable.ajak);
				}
				else if(textt.equalsIgnoreCase("bob") || textt.equalsIgnoreCase("golf") || textt.equalsIgnoreCase("ross") || textt.equalsIgnoreCase("gossip") || textt.equalsIgnoreCase("stop") || textt.equalsIgnoreCase("dogs") || textt.equalsIgnoreCase("got") ){
					txtText.setText("qaf and swash");
					viewimg.setImageResource(R.drawable.alam);
				}
				else if(textt.equalsIgnoreCase("nom") || textt.equalsIgnoreCase("mon") || textt.equalsIgnoreCase("mom")){
					txtText.setText("lam");
					viewimg.setImageResource(R.drawable.as);
				}
				else if(textt.equalsIgnoreCase("mean") || textt.equalsIgnoreCase("name") ){
					txtText.setText("meem");
					viewimg.setImageResource(R.drawable.at);
				}
				else if(textt.equalsIgnoreCase("known") || textt.equalsIgnoreCase("knowing") || textt.equalsIgnoreCase("alone") || textt.equalsIgnoreCase("01") || textt.equalsIgnoreCase("wrong") || textt.equalsIgnoreCase("norm") || textt.equalsIgnoreCase("no no")){
					txtText.setText("noon and roon");
					viewimg.setImageResource(R.drawable.auav);
				}
				else if(textt.equalsIgnoreCase("wow") || textt.equalsIgnoreCase("well") || textt.equalsIgnoreCase("low")){
					txtText.setText("waw");
					viewimg.setImageResource(R.drawable.aw);
				}
				else if(textt.equalsIgnoreCase("yea") || textt.equalsIgnoreCase("yeah")){
					txtText.setText("yeh");
					viewimg.setImageResource(R.drawable.az);
				}
				else{
					Toast.makeText(getApplicationContext(), textt, Toast.LENGTH_SHORT).show();
					viewimg.setImageResource(R.drawable.download);
				}
			}
			break;
		}

		}
	}
	@Override
	public void onInit(int code) {
		if (code==TextToSpeech.SUCCESS) {
			tts.setLanguage(Locale.getDefault());
		} else {
			tts = null;
			Toast.makeText(this, "Failed to initialize TTS engine.", Toast.LENGTH_SHORT).show();
		}
	}
	@Override
	protected void onDestroy() {
		if (tts!=null) {
			tts.stop();
            tts.shutdown();
		}
		super.onDestroy();
	}
	public  void speed(String t){
		if (tts!=null) {
			String text = t;
			if (text!=null) {
				if (!tts.isSpeaking()) {
					tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
				}
			}
		}
		
	}
}
