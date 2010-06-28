/*
 * Copyright 2010 Georgios "cyberpython" Migdos cyberpython@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License
 *       at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package documentcontainer;

import java.io.File;

/**
 *
 * @author cyberpython
 */
public interface DocumentContainer {
    
    /**
     * Returns whether the current document has been modified.
     * @return True if the current document has been modified. False otherwise.
     */
    public boolean isCurrentDocumentModified();

    /**
     * Sets whether the current document has been modified.
     * @param modified
     */
    public void setCurrentDocumentModified(boolean modified);

    /**
     * Returns whether the current document is new (not saved). A document is new only if it
     * has been created (not opened) and not saved yet.
     * @return True if the current document is new - false otherwise.
     */
    public boolean isCurrentDocumentNew();

    /**
     * Returns the File assoiated with the current document.
     * @return The File assoiated with the current document - null if the document is new.
     */
    public File getCurrentDocumentFile();

    /**
     * Returns the current document's title.
     * @return A String representing the current document's title.
     */
    public String getCurrentDocumentTitle();

    /**
     * Saves the current document contents to output.
     * @param output
     * @return True if the file was saved successfully - false otherwise.
     */
    public boolean saveDocument(File output);

    /**
     * Opens input and reads its contents
     * @param input
     * @return True if successfull - false otherwise.
     */
    public boolean openDocument(File input);

    /**
     * Creates a new empty document.
     * @return True if successfull - false otherwise.
     */
    public boolean newDocument();

    /**
     * Called by the DocumentIOManager when the list of recently accessed files
     * has changed.
     */
    public void recentlyAccessedFilesChanged();
}
