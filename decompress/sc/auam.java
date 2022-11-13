import org.brotli.dec.Dictionary;

// 
// Decompiled by Procyon v0.6.0
// 

final class auam
{
    static final boolean a;
    
    static {
        boolean a2 = false;
        try {
            final String name = Dictionary.class.getPackage().getName();
            final StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(".DictionaryData");
            Class.forName(sb.toString());
        }
        finally {
            a2 = false;
        }
        a = a2;
    }
}
