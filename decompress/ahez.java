import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahez extends ThreadLocal
{
    public ahez() {
    }
    
    @Override
    protected final Object initialValue() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        final GregorianCalendar calendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        calendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(calendar);
        return simpleDateFormat;
    }
}
