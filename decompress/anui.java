import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anui extends ahcz implements aheo
{
    public static final anui a;
    private static volatile ahev h;
    public int b;
    public int c;
    public Object d;
    public aisc e;
    public anxb f;
    public boolean g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(anui.class, a = new anui());
    }
    
    private anui() {
        this.c = 0;
        this.j = 2;
        final ahbt b = ahbt.b;
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
                final ahev h;
                if ((h = anui.h) == null) {
                    synchronized (anui.class) {
                        if (anui.h == null) {
                            anui.h = (ahev)new ahcs((ahcz)anui.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anui.a;
            }
            case 4: {
                return new ahcr((ahcz)anui.a);
            }
            case 3: {
                return new anui();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anui.a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u143c\u0000\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u143c\u0000\b\u1007\u0007", new Object[] { "d", "c", "b", "e", apop.class, "i", "f", aosj.class, "g" });
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
