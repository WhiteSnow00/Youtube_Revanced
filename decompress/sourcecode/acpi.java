// 
// Decompiled by Procyon v0.6.0
// 

public class acpi
{
    public final acpi j;
    
    protected acpi() {
        this(null);
    }
    
    protected acpi(final acpi j) {
        this.j = j;
    }
    
    public static acpi a(final acpi acpi) {
        if (acpi != null) {
            return acpi.j;
        }
        return null;
    }
}
