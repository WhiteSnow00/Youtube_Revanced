import java.util.concurrent.ExecutionException;
import android.nfc.NdefRecord;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import android.nfc.NdefMessage;
import android.nfc.NfcEvent;
import java.util.concurrent.Executor;
import android.nfc.NfcAdapter$CreateNdefMessageCallback;
import android.nfc.NfcAdapter$OnNdefPushCompleteCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glu implements NfcAdapter$OnNdefPushCompleteCallback, NfcAdapter$CreateNdefMessageCallback
{
    public final atke a;
    private final Executor b;
    
    public glu(final atke a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        final FutureTask futureTask = new FutureTask((Callable<V>)new ctz(this, 4));
        this.b.execute(futureTask);
        nfcEvent = null;
        try {
            final Pair pair = futureTask.get();
            final String s = (String)pair.first;
            if (s != null) {
                nfcEvent = (NfcEvent)new NdefMessage(new NdefRecord[] { new NdefRecord((short)3, tpe.cQ(s, "", -1, (long)pair.second / 1000L).toString().getBytes(), new byte[0], new byte[0]) });
            }
            return (NdefMessage)nfcEvent;
        }
        catch (final InterruptedException | ExecutionException ex) {
            return (NdefMessage)nfcEvent;
        }
    }
    
    public final void onNdefPushComplete(final NfcEvent nfcEvent) {
        ttr.g("NFC push completed");
    }
}
