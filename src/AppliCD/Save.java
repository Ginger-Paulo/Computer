package AppliCD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Save {

	static void ecrireFichier (String path, String nomD, String codeBarre){
		boolean utilisePrintWriter = false;

		File file = new File( path );

		try
		{
			FileOutputStream fos = new FileOutputStream( file,true );

			if( utilisePrintWriter )
			{
				PrintWriter pw = new PrintWriter( fos );

				pw.print( nomD );
				pw.println( codeBarre );

				pw.flush();

				pw.close();
			}
			else
			{
				OutputStreamWriter osw = new OutputStreamWriter( fos, "UTF8" );

				Writer out = new BufferedWriter( osw );

				out.append(nomD).append( "\r\n" );
				out.append(codeBarre).append("\r\n");

				out.flush();

				out.close();

				osw.close();
			}

			fos.close();
		}
		// new FileOutputStream( file );
		catch( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		// new OutputStreamWriter( fos, "UTF8" );
		catch( UnsupportedEncodingException e )
		{
			e.printStackTrace();
		}
		// append(), flush() et close()
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}
}
