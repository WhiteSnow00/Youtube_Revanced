import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnw extends agzi implements ahax
{
    public static final ajnw a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance((Class)ajnw.class, (agzi)(a = new ajnw()));
    }
    
    private ajnw() {
        this.b = ahas.a;
    }
    
    public final boolean a(final String s) {
        s.getClass();
        return this.b.containsKey(s);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajnw.c) == null) {
                    synchronized (ajnw.class) {
                        if (ajnw.c == null) {
                            ajnw.c = (ahbe)new agzb((agzi)ajnw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajnw.a;
            }
            case 4: {
                return new agza((boolean[][])null, (boolean[][])null);
            }
            case 3: {
                return new ajnw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ajnv.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
