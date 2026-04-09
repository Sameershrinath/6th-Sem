from rembg import remove
from PIL import Image
import os

def remove_background():
    # Get input from user
    input_path = input("Enter the path to the image file: ").strip()
    
    # Check if file exists
    if not os.path.exists(input_path):
        print("Error: File not found!")
        return
    
    # Get output path from user
    output_path = input("Enter the output path (with filename, e.g., output.png): ").strip()
    
    try:
        # Open image
        input_image = Image.open(input_path)
        
        # Remove background
        output_image = remove(input_image)
        
        # Save result
        output_image.save(output_path)
        print(f"Background removed successfully! Saved to: {output_path}")
    
    except Exception as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    remove_background()