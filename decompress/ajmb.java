import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmb extends ahcz implements aheo
{
    public static final ajmb a;
    private static volatile ahev m;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public ajws f;
    public String g;
    public boolean h;
    public ahkb i;
    public aisc j;
    public akfj k;
    public ajws l;
    private ajws n;
    private ajae o;
    private anxb p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(ajmb.class, a = new ajmb());
    }
    
    private ajmb() {
        this.c = 0;
        this.q = 2;
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = ajmb.m) == null) {
                    synchronized (ajmb.class) {
                        if (ajmb.m == null) {
                            ajmb.m = (ahev)new ahcs((ahcz)ajmb.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajmb.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmb.a);
            }
            case 3: {
                return new ajmb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmb.a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\b\u0001\u1409\u0000\u0002\u1008\u0003\u0003\u1007\u0007\u0004\u1009\t\u0006\u1037\u0000\u0007\u103b\u0000\b\u1409\u0001\t\u1409\n\n\u1409\u000b\f\u1409\r\r\u1409\u000e\u000e\u1409\u0002\u000f\u1409\u000f", new Object[] { "d", "c", "b", "e", "g", "h", "i", "n", "o", "p", "j", "k", "f", "l" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
