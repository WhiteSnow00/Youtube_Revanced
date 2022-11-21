import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwr extends ahcz implements aheo
{
    public static final alwr a;
    private static volatile ahev i;
    public int b;
    public aisc c;
    public boolean d;
    public int e;
    public long f;
    public alwq g;
    public boolean h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alwr.class, a = new alwr());
    }
    
    private alwr() {
        this.j = 2;
        this.e = 1;
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
                if ((i = alwr.i) == null) {
                    synchronized (alwr.class) {
                        if (alwr.i == null) {
                            alwr.i = (ahev)new ahcs((ahcz)alwr.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alwr.a;
            }
            case 4: {
                return new ahcr((ahcz)alwr.a);
            }
            case 3: {
                return new alwr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwr.a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0006\u0005\u1002\u0005\u0006\u1007\u0003\u0007\u1007\u0007\n\u100c\u0004", new Object[] { "b", "c", "g", "f", "d", "h", "e", alwa.d });
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
