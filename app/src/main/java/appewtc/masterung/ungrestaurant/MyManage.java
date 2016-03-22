package appewtc.masterung.ungrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {

    //Explicit
    private Myopenhelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public MyManage(Context context) {


            //Create & Connected SQLite
        myOpenHelper = new Myopenhelper(context);
        writeSqLiteDatabase = myOpenHelper.getReadableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    } //Construtor

}   //Main Class
