import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoil extends ahcz implements aheo
{
    public static final aoil a;
    private static volatile ahev e;
    public ahej b;
    public String c;
    public aisc d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aoil.class, a = new aoil());
    }
    
    private aoil() {
        this.b = ahej.a;
        this.g = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aoil.e) == null) {
                    synchronized (aoil.class) {
                        if (aoil.e == null) {
                            aoil.e = (ahev)new ahcs((ahcz)aoil.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoil.a;
            }
            case 4: {
                return new ahcr((ahcz)aoil.a);
            }
            case 3: {
                return new aoil();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoil.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u00012\u0002\u1008\u0000\u0003\u1409\u0001", new Object[] { "f", "b", aoik.a, "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
