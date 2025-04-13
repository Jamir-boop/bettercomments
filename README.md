![main.png](img/main.png)

## 🔧 Manual Fix for SDK Build Issue

**Heads-up:** The current version of the Automation Anywhere SDK has a known issue that breaks builds unless manually patched. Here’s a temporary workaround:

### 🛠 Patch Instructions

1. **Extract the JAR**
   ```bash
   jar xf BetterComments-2.11.0.jar
   ```

2. **Edit `package.json`**
   Inside the extracted contents, locate the `package.json` file.
   - Open it in editor.
   - Go to the `"commands"` section.
   - **Remove any malformed or non-standard entries.**
![package.png](img/package.png)

3. **Repackage the JAR**
   Once cleaned, repackage the JAR:
   ```bash
   jar --create --file BetterComments-PATCHED.jar -C BetterComments-2.11.0 .
   ```

---

## ⚠ Known Issue: Image not showing when re-opening taskbot

Make sure **"Secure Recording" is disabled** in your Control Room settings.

![issue.png](img/issue.png)


> 🔒 **Why?**
> Secure Recording blocks image preview functionality. If it's on, image actions will run silently but nothing will show up.

**To disable it:**
1. Log in to the Control Room with an admin account.
2. Navigate to **Setting > Bots > Secure Recording**.
3. Turn off the **Secure Recording** option.

![config.png](img/config.png)