import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbd extends ahcz implements aheo
{
    public static final aqbd a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public ahbt d;
    public int e;
    public aqcb f;
    public aqay g;
    public String h;
    private byte j;
    
    static {
        final aqbd a2 = new aqbd();
        ahcz.registerDefaultInstance(aqbd.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)amwo.b, a2, (MessageLite)a2, null, 299918355, ahgc.k, aqbd.class);
    }
    
    private aqbd() {
        this.j = 2;
        this.d = ahbt.b;
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aqbd.i) == null) {
                    synchronized (aqbd.class) {
                        if (aqbd.i == null) {
                            aqbd.i = (ahev)new ahcs((ahcz)aqbd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqbd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbd.a);
            }
            case 3: {
                return new aqbd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbd.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001\u100a\u0000\u0002\u100c\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1008\u0005", new Object[] { "c", "d", "e", amze.a(), "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
