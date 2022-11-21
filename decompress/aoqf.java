import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqf extends ahcz implements aheo
{
    public static final aoqf a;
    private static volatile ahev k;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public aisc f;
    public aoqh g;
    public ahbt h;
    public int i;
    public int j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aoqf.class, a = new aoqf());
    }
    
    private aoqf() {
        this.c = 0;
        this.m = 2;
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aoqf.k) == null) {
                    synchronized (aoqf.class) {
                        if (aoqf.k == null) {
                            aoqf.k = (ahev)new ahcs((ahcz)aoqf.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aoqf.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqf.a);
            }
            case 3: {
                return new aoqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqf.a, "\u0001\t\u0001\u0001\u0001\r\t\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u1409\u0004\u0004\u1409\u0005\u0007\u100a\u0006\b\u1409\u0007\u000b\u100c\b\f\u100c\t\r\u143c\u0000", new Object[] { "d", "c", "b", "e", akfj.class, "f", "g", "h", "l", "i", aonf.m, "j", aonf.n, aowb.class });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
