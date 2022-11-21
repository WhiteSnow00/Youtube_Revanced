import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvf extends ahcz implements aheo
{
    public static final anvf a;
    private static volatile ahev f;
    public int b;
    public akfj c;
    public String d;
    public aisc e;
    private ahjl g;
    private ajws h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(anvf.class, a = new anvf());
    }
    
    private anvf() {
        this.i = 2;
        this.d = "";
        final ahbt b = ahbt.b;
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
                if ((f = anvf.f) == null) {
                    synchronized (anvf.class) {
                        if (anvf.f == null) {
                            anvf.f = (ahev)new ahcs((ahcz)anvf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anvf.a;
            }
            case 4: {
                return new ahcr((ahcz)anvf.a);
            }
            case 3: {
                return new anvf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvf.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "g", "h" });
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
