import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlg extends ahcz implements aheo
{
    public static final ajlg a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public aqif d;
    public String e;
    public aiot f;
    public ajlf g;
    public int h;
    private byte j;
    
    static {
        final ajlg a2 = new ajlg();
        ahcz.registerDefaultInstance(ajlg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 297019532, ahgc.k, ajlg.class);
    }
    
    private ajlg() {
        this.j = 2;
        this.e = "";
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
                if ((i = ajlg.i) == null) {
                    synchronized (ajlg.class) {
                        if (ajlg.i == null) {
                            ajlg.i = (ahev)new ahcs((ahcz)ajlg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajlg.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlg.a);
            }
            case 3: {
                return new ajlg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlg.a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0001\u0002\u1008\u0002\u0006\u1009\u0006\u0007\u1009\u0005\b\u1409\u0001\t\u1004\u0007", new Object[] { "c", "e", "g", "f", "d", "h" });
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
