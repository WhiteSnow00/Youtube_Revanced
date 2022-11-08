import android.app.Person;
import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class agc
{
    static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final int semanticAction) {
        return notification$Action$Builder.setSemanticAction(semanticAction);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final Person person) {
        return notification$Builder.addPerson(person);
    }
}
