import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjf extends ahcz implements aheo
{
    public static final ajjf a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public aqif d;
    public String e;
    private aqkv g;
    private aqkv h;
    private byte i;
    
    static {
        final ajjf a2 = new ajjf();
        ahcz.registerDefaultInstance(ajjf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 353892150, ahgc.k, ajjf.class);
    }
    
    private ajjf() {
        this.i = 2;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ajjf.f) == null) {
                    synchronized (ajjf.class) {
                        if (ajjf.f == null) {
                            ajjf.f = (ahev)new ahcs((ahcz)ajjf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajjf.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjf.a);
            }
            case 3: {
                return new ajjf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjf.a, "\u0001\u0004\u0000\u0001\u0002\u000e\u0004\u0000\u0000\u0003\u0002\u1008\u0014\u000b\u1409\u0001\r\u1409\b\u000e\u1409\n", new Object[] { "c", "e", "d", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
