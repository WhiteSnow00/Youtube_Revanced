import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoim extends ahcz implements aheo
{
    public static final aoim a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public aisc d;
    public aisc e;
    public String f;
    public aoil g;
    private byte i;
    
    static {
        final aoim a2 = new aoim();
        ahcz.registerDefaultInstance(aoim.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 410400906, ahgc.k, aoim.class);
    }
    
    private aoim() {
        this.i = 2;
        this.f = "";
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
                final ahev h;
                if ((h = aoim.h) == null) {
                    synchronized (aoim.class) {
                        if (aoim.h == null) {
                            aoim.h = (ahev)new ahcs((ahcz)aoim.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoim.a;
            }
            case 4: {
                return new ahcr((ahcz)aoim.a);
            }
            case 3: {
                return new aoim();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoim.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
